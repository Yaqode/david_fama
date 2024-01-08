package com.market.fama.domain;

import com.market.fama.persistence.entity.Compra;
import com.market.fama.persistence.entity.EstatusPedido;
import com.market.fama.persistence.entity.PedidoProducto;
import jakarta.persistence.*;

import java.util.Date;

public class Order {

    private Integer orderId;
    private Double orderTotal;
    private boolean activeOrder;
    private Date dateCreationOrder;
    private String instructionDeliveryOrder;
    private Date dateDeliveryOrder;
    private Integer deliveryOrderDirectionId;
    private Integer userId;
    private Buy buy;
    private OrderProduct orderProduct;
    private StatusOrder statusOrder;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Double getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(Double orderTotal) {
        this.orderTotal = orderTotal;
    }

    public boolean isActiveOrder() {
        return activeOrder;
    }

    public void setActiveOrder(boolean activeOrder) {
        this.activeOrder = activeOrder;
    }

    public Date getDateCreationOrder() {
        return dateCreationOrder;
    }

    public void setDateCreationOrder(Date dateCreationOrder) {
        this.dateCreationOrder = dateCreationOrder;
    }

    public String getInstructionDeliveryOrder() {
        return instructionDeliveryOrder;
    }

    public void setInstructionDeliveryOrder(String instructionDeliveryOrder) {
        this.instructionDeliveryOrder = instructionDeliveryOrder;
    }

    public Date getDateDeliveryOrder() {
        return dateDeliveryOrder;
    }

    public void setDateDeliveryOrder(Date dateDeliveryOrder) {
        this.dateDeliveryOrder = dateDeliveryOrder;
    }

    public Integer getDeliveryOrderDirectionId() {
        return deliveryOrderDirectionId;
    }

    public void setDeliveryOrderDirectionId(Integer deliveryOrderDirectionId) {
        this.deliveryOrderDirectionId = deliveryOrderDirectionId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Buy getBuy() {
        return buy;
    }

    public void setBuy(Buy buy) {
        this.buy = buy;
    }

    public OrderProduct getOrderProduct() {
        return orderProduct;
    }

    public void setOrderProduct(OrderProduct orderProduct) {
        this.orderProduct = orderProduct;
    }

    public StatusOrder getStatusOrder() {
        return statusOrder;
    }

    public void setStatusOrder(StatusOrder statusOrder) {
        this.statusOrder = statusOrder;
    }
}
