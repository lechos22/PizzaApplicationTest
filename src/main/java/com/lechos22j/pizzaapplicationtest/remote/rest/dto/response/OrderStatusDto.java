package com.lechos22j.pizzaapplicationtest.remote.rest.dto.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.lechos22j.pizzaapplicationtest.domain.model.OrderStatusType;

import java.util.Date;

public class OrderStatusDto {
    // fields: OrderStatusType status, Date createdAt, Date updatedAt, Date expectedAt
    private OrderStatusType status;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createdAt;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updatedAt;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date expectedAt;
    // constructors: OrderStatusDto(), OrderStatusDto(OrderStatusType status, Date createdAt, Date updatedAt, Date expectedAt)
    public OrderStatusDto() {
    }
    public OrderStatusDto(OrderStatusType status, Date createdAt, Date updatedAt, Date expectedAt) {
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.expectedAt = expectedAt;
    }
    // getters and setters: getStatus(), setStatus(OrderStatusType status), getCreatedAt(), setCreatedAt(Date createdAt), getUpdatedAt(), setUpdatedAt(Date updatedAt), getExpectedAt(), setExpectedAt(Date expectedAt)
    public OrderStatusType getStatus() {
        return status;
    }
    public void setStatus(OrderStatusType status) {
        this.status = status;
    }
    public Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    public Date getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
    public Date getExpectedAt() {
        return expectedAt;
    }
    public void setExpectedAt(Date expectedAt) {
        this.expectedAt = expectedAt;
    }
}
