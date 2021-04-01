package com.ibm.garage.grocerylistservice.repositories;

import com.ibm.garage.grocerylistservice.domain.GroceryList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.Optional;

@RepositoryRestResource(collectionResourceRel = "lists", path="lists")
public interface GroceryListRepository extends CrudRepository<GroceryList,Long> {

    Optional<GroceryList> findByName(@Param("name") String name);

    //Not exposed by Spring Data REST
    @Override
    @RestResource(exported = false)
    <S extends GroceryList> S save(S s);

    //Not exposed by Spring Data REST
    @Override
    @RestResource(exported = false)
    <S extends GroceryList> Iterable<S> saveAll(Iterable<S> iterable);

    //Not exposed by Spring Data REST

    @RestResource(exported = false)
    void deleteById(Long id);

    //Not exposed by Spring Data REST
    @Override
    @RestResource(exported = false)
    void delete(GroceryList groceryList);

    //Not exposed by Spring Data REST
    @Override
    @RestResource(exported = false)
    void deleteAll(Iterable<? extends GroceryList> iterable);

    //Not exposed by Spring Data REST
    @Override
    @RestResource(exported = false)
    void deleteAll();
}
