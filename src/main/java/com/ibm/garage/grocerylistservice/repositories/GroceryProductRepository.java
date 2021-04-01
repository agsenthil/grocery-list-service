package com.ibm.garage.grocerylistservice.repositories;

import com.ibm.garage.grocerylistservice.domain.GroceryProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;

@RepositoryRestResource
public interface GroceryProductRepository extends JpaRepository<GroceryProduct,Long> {

    Optional<GroceryProduct> findByName(String productName);
}
