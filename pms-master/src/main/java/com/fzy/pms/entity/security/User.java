package com.fzy.pms.entity.security;

import com.fzy.pms.entity.enums.Constants;
import com.fzy.pms.entity.enums.UseStatus;
import com.google.common.collect.Sets;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.math.BigDecimal;
import java.util.Collection;

/**
 * @program: User
 * @description: 用户表
 * @author: fzy
 * @date: 2019/03/17 12:13:14
 **/
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name="t_user")
@ApiModel("用户")
@SQLDelete(sql = "update t_user set delete_flag="+ Constants.DELETED+" where id= ?")
@Where(clause = "delete_flag="+ Constants.NORMEL)
public class User extends Base implements UserDetails {

    @NotBlank(message = "用户名不能为空")
    //@Column(unique = true)
    private String username;

    @NotBlank(message = "密码不能为空")
    private String password;

    @Email(message = "邮箱不符合规则")
    private String email;

    @Pattern(regexp = "^1([38][0-9]|4[579]|5[0-3,5-9]|6[6]|7[0135678]|9[89])\\d{8}$", message = "手机号码不符合规范")
    @NotBlank(message = "手机号码不能为空")
    private String phone;

    @NotBlank(message = "名字不能为空")
    private String realName;

    @ApiModelProperty("账户余额")
    @Column(columnDefinition = "decimal(19,2) default 0")
    private BigDecimal balance=BigDecimal.ZERO;

    @ApiModelProperty("激活用户状态")
    @Enumerated(EnumType.STRING)
    private UseStatus useStatus= UseStatus.ENABLED;

    @ManyToOne(cascade = CascadeType.REFRESH,fetch = FetchType.EAGER)
    @JoinColumn(name = "role_id", referencedColumnName="id",nullable = false)
    private Role role;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Sets.newHashSet(new SimpleGrantedAuthority(role.getName()));
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return useStatus.equals(UseStatus.ENABLED);
    }

}
