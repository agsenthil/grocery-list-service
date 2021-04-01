package com.ibm.garage.grocerylistservice.repositories;


import com.ibm.garage.grocerylistservice.domain.GroceryItem;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;

public interface GroceryItemRepository extends PagingAndSortingRepository<GroceryItem,Long> {

    //Not exposed by Spring Data REST
    @Override
    @RestResource(exported = false)
    <S extends GroceryItem> S save(S s);

    //Not exposed by Spring Data REST
    @Override
    @RestResource(exported = false)
    <S extends GroceryItem> Iterable<S> saveAll(Iterable<S> iterable);

    //Not exposed by Spring Data REST
    @RestResource(exported = false)
    void deleteById(Long id);

    //Not exposed by Spring Data REST
    @Override
    @RestResource(exported = false)
    void delete(GroceryItem GroceryItem);

    //Not exposed by Spring Data REST
    @Override
    @RestResource(exported = false)
    void deleteAll(Iterable<? extends GroceryItem> iterable);

    //Not exposed by Spring Data REST
    @Override
    @RestResource(exported = false)
    void deleteAll();
}
