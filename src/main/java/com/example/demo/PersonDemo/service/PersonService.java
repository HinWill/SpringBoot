package com.example.demo.PersonDemo.service;

import com.example.demo.PersonDemo.domain.Person;
import com.example.demo.PersonDemo.enums.ResultEnum;
import com.example.demo.PersonDemo.exception.PersonException;
import com.example.demo.PersonDemo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by gray- on 2017/8/3.
 */
@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;


    //增加事务管理
    @Transactional
    public void inserTwo(){

        Person person1 = new Person();
        person1.setName("小新");
        person1.setSex("m");
        personRepository.save(person1);

        Person person2 = new Person();
        person2.setName("小白");
        person2.setSex("man");
        personRepository.save(person2);

    }


    public void getSex(Integer id) throws Exception{
        Person person = personRepository.findOne(id);

        String sex = person.getSex();

        if(sex.equals("man")){
            throw new PersonException(ResultEnum.MAN);
        }else if(sex.equals("woman")) {
            throw new PersonException(ResultEnum.WOMAN);
        }else {
            System.out.println("小姑娘，你好");
        }
    }
}
