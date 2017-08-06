package com.example.demo.OracleDemo.service;

import com.example.demo.OracleDemo.domain.Person;

/**
 * Created by gray- on 2017/8/5.
 */
public interface PersonService {

    public Person save(Person person);

    public void remove(Integer id);

    public Person findOne(Person person);
}
