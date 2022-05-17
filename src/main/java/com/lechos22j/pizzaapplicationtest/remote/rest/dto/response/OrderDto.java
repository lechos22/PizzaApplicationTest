package com.lechos22j.pizzaapplicationtest.remote.rest.dto.response;

import com.lechos22j.pizzaapplicationtest.domain.model.OrderStatusType;

import java.util.List;

public class OrderDto {
    // fields: Integer id, OrderStatusType status, List<PizzaOrderDto> pizzas, PersonDto person
    private Integer id;
    private OrderStatusType status;
    private List<PizzaOrderDto> pizzas;
}
