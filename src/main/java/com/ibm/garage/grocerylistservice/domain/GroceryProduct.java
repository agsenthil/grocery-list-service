package com.ibm.garage.grocerylistservice.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "t_grocery_products")
@Data
public class GroceryProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String name;
    private String description;
    private String unit;

}
