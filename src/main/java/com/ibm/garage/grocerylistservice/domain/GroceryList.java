package com.ibm.garage.grocerylistservice.domain;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name="t_grocery_lists")
@Data
public class GroceryList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    @JoinColumn(name="groceryListId",referencedColumnName = "id",insertable = false,updatable = false)
    private List<GroceryItem> groceryItems;

    private String createdUserId;

    private Timestamp createdDttm;

    private String updatedUserId;

    private Timestamp updatedDttm;
}
