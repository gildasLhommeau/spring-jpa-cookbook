package org.cookbook.dao;


import org.cookbook.model.MyData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface MyDataRepository extends CrudRepository<MyData, Integer> {


}
