package com.example.demo.PersonDemo.repository;

import com.example.demo.PersonDemo.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by gray- on 2017/8/3.
 */
public interface PersonRepository extends JpaRepository<Person, Integer> {


    /**
     * 通过性别来进行查询
     */
    public List<Person> findBySex(String sex);
}
