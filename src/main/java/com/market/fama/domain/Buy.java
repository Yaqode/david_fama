package com.market.fama.domain;

import com.market.fama.persistence.entity.Pedido;
import jakarta.persistence.*;

import java.util.Date;

public class Buy {
    private Integer buyId;
    private String transactionKeyPaypal;
    private Date buyDate;
    private Integer orderId;
    private Order order;

    public Integer getBuyId() {
        return buyId;
    }

    public void setBuyId(Integer buyId) {
        this.buyId = buyId;
    }

    public String getTransactionKeyPaypal() {
        return transactionKeyPaypal;
    }

    public void setTransactionKeyPaypal(String transactionKeyPaypal) {
        this.transactionKeyPaypal = transactionKeyPaypal;
    }

    public Date getBuyDate() {
        return buyDate;
    }

    public void setBuyDate(Date buyDate) {
        this.buyDate = buyDate;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}