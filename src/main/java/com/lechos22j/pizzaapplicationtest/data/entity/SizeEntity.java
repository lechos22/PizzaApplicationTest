package com.lechos22j.pizzaapplicationtest.data.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "sizes")
public class SizeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "size")
    private String size;

    @Column(name = "price")
    private BigDecimal price;
}
