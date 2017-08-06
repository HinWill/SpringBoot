package com.example.demo.OracleDemo.service.impl;

import com.example.demo.OracleDemo.dao.PersonRepository;
import com.example.demo.OracleDemo.domain.Person;
import com.example.demo.OracleDemo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Service;

/**
 * Created by gray- on 2017/8/5.
 */
@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonRepository personRepository;

    /**
     * 缓存新增的或者更新的数据到缓存中，
     * 缓存的名称为people,数据的key为person的id
     * @param person
     * @return
     */
    @Override
    @CacheEvict(value = "people", key = "#person.id")
    public Person save(Person person) {
        Person p = personRepository.save(person);
        System.out.println("为id、key为："+p.getId()+"数据做了缓存");
        return p;
    }


    /**
     *从缓存people中删除可以为id的数据
     * @param id
     */
    @Override
    @CacheEvict(value = "people")
    public void remove(Integer id) {
        System.out.println("删除了id、key为："+id+"的数据缓存");
        personRepository.delete(id);
    }


    /**
     * 通过查找id，为其做缓存
     * @param person
     * @return
     */

    @Override
    @CacheEvict(value = "people", key = "#person.id")
    public Person findOne(Person person) {
        Person p = personRepository.findOne(person.getId());
        System.out.println("为id、key为："+p.getId()+"数据做了缓存");
        return p;
    }
}
