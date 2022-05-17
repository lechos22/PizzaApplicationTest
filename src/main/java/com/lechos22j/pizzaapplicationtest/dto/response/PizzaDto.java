package com.lechos22j.pizzaapplicationtest.dto.response;

import java.util.List;

public class PizzaDto {
    // fields: Integer id, String name, List<PizzaSizeDto> sizes
    private Integer id;
    private String name;
    private List<PizzaSizeDto> sizes;
    // constructors: PizzaDto(), PizzaDto(Integer id, String name, List<PizzaSizeDto> sizes)
    public PizzaDto() {
        super();
    }
    public PizzaDto(Integer id, String name, List<PizzaSizeDto> sizes) {
        super();
        this.id = id;
        this.name = name;
        this.sizes = sizes;
    }
    // getters and setters: getId(), setId(Integer id), getName(), setName(String name), getSizes(), setSizes(List<PizzaSizeDto> sizes)
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<PizzaSizeDto> getSizes() {
        return sizes;
    }
    public void setSizes(List<PizzaSizeDto> sizes) {
        this.sizes = sizes;
    }
}
