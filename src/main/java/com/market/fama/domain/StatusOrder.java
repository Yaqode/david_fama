package com.market.fama.domain;

import com.market.fama.persistence.entity.Estatus;
import com.market.fama.persistence.entity.Pedido;
import jakarta.persistence.*;

import java.util.Date;

public class StatusOrder {
    private Integer orderStatusId;
    private Integer statusId;
    private Integer orderId;
    private String activeStatusOrder;
    private Date dateChangeStatusOrder;
    private Status status;
    private Order order;

    public Integer getOrderStatusId() {
        return orderStatusId;
    }

    public void setOrderStatusId(Integer orderStatusId) {
        this.orderStatusId = orderStatusId;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        statusId = statusId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getActiveStatusOrder() {
        return activeStatusOrder;
    }

    public void setActiveStatusOrder(String activeStatusOrder) {
        this.activeStatusOrder = activeStatusOrder;
    }

    public Date getDateChangeStatusOrder() {
        return dateChangeStatusOrder;
    }

    public void setDateChangeStatusOrder(Date dateChangeStatusOrder) {
        this.dateChangeStatusOrder = dateChangeStatusOrder;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
