package com.lechos22j.pizzaapplicationtest.dto.request;

public class PizzaOrderDto {
    // fields: Integer sizeId, Integer count
    private Integer sizeId;
    private Integer count;
    // constructors: PizzaOrderDto(), PizzaOrderDto(Integer sizeId, Integer count)
    public PizzaOrderDto() {
    }
    public PizzaOrderDto(Integer sizeId, Integer count) {
        this.sizeId = sizeId;
        this.count = count;
    }
    // getters and setters: getSizeId(), getCount(), setSizeId(Integer sizeId), setCount(Integer count)
    public Integer getSizeId() {
        return sizeId;
    }
    public void setSizeId(Integer sizeId) {
        this.sizeId = sizeId;
    }
    public Integer getCount() {
        return count;
    }
    public void setCount(Integer count) {
        this.count = count;
    }
}
