package com.lechos22j.pizzaapplicationtest.remote.rest.dto.request;

import java.util.List;

public class OrderDto {
    // fields: List<PizzaOrderDto> pizzas, PersonDto person
    private List<PizzaOrderDto> pizzas;
    private PersonDto person;
    // constructors: OrderDto(), OrderDto(List<PizzaOrderDto> pizzas, PersonDto person)
    public OrderDto() {
    }
    public OrderDto(List<PizzaOrderDto> pizzas, PersonDto person) {
        this.pizzas = pizzas;
        this.person = person;
    }
    // getters and setters: getPizzas(), setPizzas(), getPerson(), setPerson()
    public List<PizzaOrderDto> getPizzas() {
        return pizzas;
    }
    public void setPizzas(List<PizzaOrderDto> pizzas) {
        this.pizzas = pizzas;
    }
    public PersonDto getPerson() {
        return person;
    }
    public void setPerson(PersonDto person) {
        this.person = person;
    }
}
