package com.lechos22j.pizzaapplicationtest.remote.rest.dto.response;

public class PizzaOrderDto {
    // fields: Integer id, Integer sizeId, Integer count
    private Integer id;
    private Integer sizeId;
    private Integer count;
    // constructors: PizzaOrderDto(), PizzaOrderDto(Integer id, Integer sizeId, Integer count)
    public PizzaOrderDto() {
    }
    public PizzaOrderDto(Integer id, Integer sizeId, Integer count) {
        this.id = id;
        this.sizeId = sizeId;
        this.count = count;
    }
    // getters and setters: getId, getSizeId(), getCount(), setId(Integer id), setSizeId(Integer sizeId), setCount(Integer count)
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
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
