package com.ibm.garage.grocerylistservice.domain;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "t_grocery_items")
@Data
public class GroceryItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long productId;

    private Long groceryListId;

    private int quantity;

    private String createdUserId;

    private Timestamp createdDttm;

    private String updatedUserId;

    private Timestamp updatedDttm;


    @OneToOne
    @JoinColumn(name = "productId", referencedColumnName = "id", insertable = false, updatable = false)
    private GroceryProduct product;

    @ManyToOne
    @JoinColumn(name="groceryListId",referencedColumnName = "id",insertable = false,updatable = false)
    private GroceryList groceryList;
}
