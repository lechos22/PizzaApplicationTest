package com.lechos22j.pizzaapplicationtest.dto.response;

import com.lechos22j.pizzaapplicationtest.type.PizzaSizeType;

import java.math.BigDecimal;

public class PizzaSizeDto {
    // fields: Integer id, PizzaSizeType size, BigDecimal price
    private Integer id;
    private PizzaSizeType size;
    private BigDecimal price;
    // constructors: PizzaSizeDto(), PizzaSizeDto(Integer id, String name, BigDecimal price)
    public PizzaSizeDto() {
        super();
    }
    public PizzaSizeDto(Integer id, PizzaSizeType size, BigDecimal price) {
        super();
        this.id = id;
        this.size = size;
        this.price = price;
    }
    // getters and setters: getId(), setId(Integer id), getName(), setName(String name), getPrice(), setPrice(BigDecimal price)
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public PizzaSizeType getSize() {
        return size;
    }
    public void setSize(PizzaSizeType size) {
        this.size = size;
    }
    public BigDecimal getPrice() {
        return price;
    }
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
