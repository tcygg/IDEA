package com.fzy.pms.web.config.security;

import com.fzy.pms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.authentication.logout.LogoutFilter;

/**
 * @program: WebSecurityConfig
 * @description:
 * @author: fzy
 * @date: 2019/03/16 18:15:36
 **/
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserService userService;

    @Autowired
    private SecuritySuccessHandler securitySuccessHandler;

    @Autowired
    private SecurityFailureHandler securityFailureHandler;

    @Autowired
    private RestAccessDeniedHandler accessDeniedHandler;

    @Autowired
    private LogoutSuccessHandler logoutSuccessHandler;

    @Autowired
    private JwtTokenFilter jwtTokenFilter;

    @Override //配置策略
    protected void configure(HttpSecurity http) throws Exception {
        http
            .formLogin().loginProcessingUrl("/login")
            .successHandler(securitySuccessHandler)
            .failureHandler(securityFailureHandler).and()
            .logout().logoutSuccessHandler(logoutSuccessHandler).and()
            //拦截全部请求
            .authorizeRequests().antMatchers(HttpMethod.OPTIONS).permitAll().and()
            //跨域支持
            .cors().and()
            //关闭跨站请求防护
            .csrf().disable()
            //前后端分离采用JWT 不需要session
            .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
            //自定义权限拒绝处理类
            .exceptionHandling().authenticationEntryPoint(macLoginUrlAuthenticationEntryPoint()).accessDeniedHandler(accessDeniedHandler).and()
            //添加JWT过滤器 除/login其它请求都需经过此过滤器
            .addFilterBefore(jwtTokenFilter, LogoutFilter.class);
        // 禁用缓存
        http.headers().cacheControl();
    }

    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userService);
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        //每一个请求对应一个空的filter链,这里一般不要配置过多,
        web.ignoring().antMatchers("/static/**",
                "/v2/api-docs",
                "/configuration/**",
                "/swagger-resources/**",
                "/webjars/**",
                "/swagger-ui.html");
    }

    //密码加密
    @Bean
    public BCryptPasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationEntryPoint macLoginUrlAuthenticationEntryPoint() {
        return new LoginUrlAuthentication("/login");
    }

}
