package com.example.demo.MongoDBDemo.dao;

import com.example.demo.MongoDBDemo.domain.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

/**
 * Created by gray- on 2017/8/5.
 */
public interface PersonRepository extends MongoRepository<Person, String> {
    Person findByName(String name);

    @Query("{'age': ?0}")
    List<Person> withQueryFindByAge(Integer age);
}
