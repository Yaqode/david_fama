package com.market.fama.domain;

import com.market.fama.persistence.entity.EstatusPedido;
import jakarta.persistence.*;

public class Status {
    private Integer statusId;
    private String statusName;
    private String statusDescription;
    private Integer noStatus;
    private StatusOrder orderStatus;

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public String getStatusDescription() {
        return statusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    public Integer getNoStatus() {
        return noStatus;
    }

    public void setNoStatus(Integer noStatus) {
        this.noStatus = noStatus;
    }

    public StatusOrder getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(StatusOrder orderStatus) {
        this.orderStatus = orderStatus;
    }
}
