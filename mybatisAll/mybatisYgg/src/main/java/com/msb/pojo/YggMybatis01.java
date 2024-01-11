package com.msb.pojo;

import java.io.Serializable;
import java.util.Date;

import lombok.*;

/**
 * 
 * @TableName ygg_mybatis_01
 */
@Data
/*
@Data
整合包，只要加了 @Data 这个注解，等于同时加了以下注解
@Getter/@Setter
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor //这个就是生成  final修饰符的字段,自动生成构造器
*/

@AllArgsConstructor
@NoArgsConstructor
public class YggMybatis01 implements Serializable {
    /**
     * yg订单表主键id
     */
    private Integer idYg;

    /**
     * 订单编号
     */
    private String orderNoYg;

    /**
     * 订单项目类型
     */
    private String orderTypeYg;

    /**
     * 计划完成总数量
     */
    private Long orderPlanAllnum;

    /**
     * 0.5月中计计划总数量
     */
    private Long orderPlanNownum;

    /**
     * 到现在完成数
     */
    private Long orderOverNownum;

    /**
     * 月总差额数量
     */
    private Long chaenum;

    /**
     * 到当前不定0.5月差额数量
     */
    private Long chaenumNow;

    /**
     * 与0.5月比累计delay数量
     */
    private Long orderDelayNownum;

    /**
     * 完成进度百分比
     */
    private Double orderOverRate;

    /**
     * 0.5月比delay进度百分比
     */
    private Double orderDelayRate;

    /**
     * 创建时间默认新建时间
     */
    private Date createTime;

    /**
     * 更新时间更新变化
     */
    private Date updateTime;

    /**
     * 预期到货时间
     */
    private Date expectArrivalTime;

    /**
     * 订单更新人id
     */
    private Integer orderUpdatePerson;

    /**
     * 仓库
     */
    private String warehouse;

    /**
     * 单据状态
     */
    private String orderState;

    /**
     * 地址
     */
    private String address;

    /**
     * 工厂
     */
    private String factory;

    /**
     * 产线
     */
    private String productionLine;

    /**
     * 工站
     */
    private String workstation;

    /**
     * 机器人状态
     */
    private String robotState;

    /**
     * 备注yg
     */
    private String remarkYg;

    /**
     * 超链接log
     */
    private String remark2Yg;

    /**
     * date格式时间
     */
    private Date dateTime;

    /**
     * 图片
     */
    private String jpgYg;

    private static final long serialVersionUID = 1L;

    public YggMybatis01(Integer idYg, String orderNoYg) {
        this.idYg = idYg;
        this.orderNoYg = orderNoYg;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        YggMybatis01 other = (YggMybatis01) that;
        return (this.getIdYg() == null ? other.getIdYg() == null : this.getIdYg().equals(other.getIdYg()))
            && (this.getOrderNoYg() == null ? other.getOrderNoYg() == null : this.getOrderNoYg().equals(other.getOrderNoYg()))
            && (this.getOrderTypeYg() == null ? other.getOrderTypeYg() == null : this.getOrderTypeYg().equals(other.getOrderTypeYg()))
            && (this.getOrderPlanAllnum() == null ? other.getOrderPlanAllnum() == null : this.getOrderPlanAllnum().equals(other.getOrderPlanAllnum()))
            && (this.getOrderPlanNownum() == null ? other.getOrderPlanNownum() == null : this.getOrderPlanNownum().equals(other.getOrderPlanNownum()))
            && (this.getOrderOverNownum() == null ? other.getOrderOverNownum() == null : this.getOrderOverNownum().equals(other.getOrderOverNownum()))
            && (this.getChaenum() == null ? other.getChaenum() == null : this.getChaenum().equals(other.getChaenum()))
            && (this.getChaenumNow() == null ? other.getChaenumNow() == null : this.getChaenumNow().equals(other.getChaenumNow()))
            && (this.getOrderDelayNownum() == null ? other.getOrderDelayNownum() == null : this.getOrderDelayNownum().equals(other.getOrderDelayNownum()))
            && (this.getOrderOverRate() == null ? other.getOrderOverRate() == null : this.getOrderOverRate().equals(other.getOrderOverRate()))
            && (this.getOrderDelayRate() == null ? other.getOrderDelayRate() == null : this.getOrderDelayRate().equals(other.getOrderDelayRate()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getExpectArrivalTime() == null ? other.getExpectArrivalTime() == null : this.getExpectArrivalTime().equals(other.getExpectArrivalTime()))
            && (this.getOrderUpdatePerson() == null ? other.getOrderUpdatePerson() == null : this.getOrderUpdatePerson().equals(other.getOrderUpdatePerson()))
            && (this.getWarehouse() == null ? other.getWarehouse() == null : this.getWarehouse().equals(other.getWarehouse()))
            && (this.getOrderState() == null ? other.getOrderState() == null : this.getOrderState().equals(other.getOrderState()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getFactory() == null ? other.getFactory() == null : this.getFactory().equals(other.getFactory()))
            && (this.getProductionLine() == null ? other.getProductionLine() == null : this.getProductionLine().equals(other.getProductionLine()))
            && (this.getWorkstation() == null ? other.getWorkstation() == null : this.getWorkstation().equals(other.getWorkstation()))
            && (this.getRobotState() == null ? other.getRobotState() == null : this.getRobotState().equals(other.getRobotState()))
            && (this.getRemarkYg() == null ? other.getRemarkYg() == null : this.getRemarkYg().equals(other.getRemarkYg()))
            && (this.getRemark2Yg() == null ? other.getRemark2Yg() == null : this.getRemark2Yg().equals(other.getRemark2Yg()))
            && (this.getDateTime() == null ? other.getDateTime() == null : this.getDateTime().equals(other.getDateTime()))
            && (this.getJpgYg() == null ? other.getJpgYg() == null : this.getJpgYg().equals(other.getJpgYg()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdYg() == null) ? 0 : getIdYg().hashCode());
        result = prime * result + ((getOrderNoYg() == null) ? 0 : getOrderNoYg().hashCode());
        result = prime * result + ((getOrderTypeYg() == null) ? 0 : getOrderTypeYg().hashCode());
        result = prime * result + ((getOrderPlanAllnum() == null) ? 0 : getOrderPlanAllnum().hashCode());
        result = prime * result + ((getOrderPlanNownum() == null) ? 0 : getOrderPlanNownum().hashCode());
        result = prime * result + ((getOrderOverNownum() == null) ? 0 : getOrderOverNownum().hashCode());
        result = prime * result + ((getChaenum() == null) ? 0 : getChaenum().hashCode());
        result = prime * result + ((getChaenumNow() == null) ? 0 : getChaenumNow().hashCode());
        result = prime * result + ((getOrderDelayNownum() == null) ? 0 : getOrderDelayNownum().hashCode());
        result = prime * result + ((getOrderOverRate() == null) ? 0 : getOrderOverRate().hashCode());
        result = prime * result + ((getOrderDelayRate() == null) ? 0 : getOrderDelayRate().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getExpectArrivalTime() == null) ? 0 : getExpectArrivalTime().hashCode());
        result = prime * result + ((getOrderUpdatePerson() == null) ? 0 : getOrderUpdatePerson().hashCode());
        result = prime * result + ((getWarehouse() == null) ? 0 : getWarehouse().hashCode());
        result = prime * result + ((getOrderState() == null) ? 0 : getOrderState().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getFactory() == null) ? 0 : getFactory().hashCode());
        result = prime * result + ((getProductionLine() == null) ? 0 : getProductionLine().hashCode());
        result = prime * result + ((getWorkstation() == null) ? 0 : getWorkstation().hashCode());
        result = prime * result + ((getRobotState() == null) ? 0 : getRobotState().hashCode());
        result = prime * result + ((getRemarkYg() == null) ? 0 : getRemarkYg().hashCode());
        result = prime * result + ((getRemark2Yg() == null) ? 0 : getRemark2Yg().hashCode());
        result = prime * result + ((getDateTime() == null) ? 0 : getDateTime().hashCode());
        result = prime * result + ((getJpgYg() == null) ? 0 : getJpgYg().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", idYg=").append(idYg);
        sb.append(", orderNoYg=").append(orderNoYg);
        sb.append(", orderTypeYg=").append(orderTypeYg);
        sb.append(", orderPlanAllnum=").append(orderPlanAllnum);
        sb.append(", orderPlanNownum=").append(orderPlanNownum);
        sb.append(", orderOverNownum=").append(orderOverNownum);
        sb.append(", chaenum=").append(chaenum);
        sb.append(", chaenumNow=").append(chaenumNow);
        sb.append(", orderDelayNownum=").append(orderDelayNownum);
        sb.append(", orderOverRate=").append(orderOverRate);
        sb.append(", orderDelayRate=").append(orderDelayRate);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", expectArrivalTime=").append(expectArrivalTime);
        sb.append(", orderUpdatePerson=").append(orderUpdatePerson);
        sb.append(", warehouse=").append(warehouse);
        sb.append(", orderState=").append(orderState);
        sb.append(", address=").append(address);
        sb.append(", factory=").append(factory);
        sb.append(", productionLine=").append(productionLine);
        sb.append(", workstation=").append(workstation);
        sb.append(", robotState=").append(robotState);
        sb.append(", remarkYg=").append(remarkYg);
        sb.append(", remark2Yg=").append(remark2Yg);
        sb.append(", dateTime=").append(dateTime);
        sb.append(", jpgYg=").append(jpgYg);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}