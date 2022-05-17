package com.lechos22j.pizzaapplicationtest.dto.response;

import java.util.List;

public class PizzaCollectionDto {
    // fields: List<PizzaDto> pizzas
    private List<PizzaDto> pizzas;
    // constructors: PizzaCollectionDto(), PizzaCollectionDto(List<PizzaDto> pizzas)
    public PizzaCollectionDto() {
    }
    public PizzaCollectionDto(List<PizzaDto> pizzas) {
        this.pizzas = pizzas;
    }
    // getters and setters: getPizzas(), setPizzas(List<PizzaDto> pizzas)
    public List<PizzaDto> getPizzas() {
        return pizzas;
    }
    public void setPizzas(List<PizzaDto> pizzas) {
        this.pizzas = pizzas;
    }
}
