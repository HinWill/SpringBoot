package com.example.demo.PersonDemo.controller;

import com.example.demo.PersonDemo.domain.Person;
import com.example.demo.PersonDemo.domain.Result;
import com.example.demo.PersonDemo.repository.PersonRepository;
import com.example.demo.PersonDemo.service.PersonService;
import com.example.demo.PersonDemo.untils.ResultUntils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by gray- on 2017/8/3.
 */
@RestController
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private PersonService personService;


    /**
     * 查询所有person
     * @return
     */

    @GetMapping(value = "/persons")
    public List<Person> personList(){
        return personRepository.findAll();
    }


    /**
     * 添加新用户
     * @return
     */

    @PostMapping(value = "/person")
    public Result<Person> personAdd(@Valid Person person, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return ResultUntils.error(1,bindingResult.getFieldError().getDefaultMessage());
        }

        person.setName(person.getName());
        person.setSex(person.getSex());

        return ResultUntils.success(personRepository.save(person));
    }


    /**
     * 查询单个用户
     * @param id
     * @return
     */

    @GetMapping(value = "/person/{id}")
    public Person personFindOne(@PathVariable("id") Integer id){
        return personRepository.findOne(id);
    }


    /**
     * 更新用户信息
     * @param id
     * @param name
     * @param sex
     * @return
     */

    @PutMapping(value = "/person/{id}")
    public Person personPut(@PathVariable("id") Integer id,
                            @RequestParam("name") String name,
                            @RequestParam("sex") String sex){
        Person person = new Person();
        person.setId(id);
        person.setName(name);
        person.setSex(sex);

        return personRepository.save(person);
    }


    /**
     * 删除用户信息
     * @param id
     */

    @DeleteMapping(value = "/person/{id}")
    public void personDelete(@PathVariable("id") Integer id){
        personRepository.delete(id);
    }

    /**
     * 通过性别来进行查询
     */
    @GetMapping(value = "/person/sex/{sex}")
    public List<Person> personFindSex(@PathVariable("sex") String sex){
        return personRepository.findBySex(sex);
    }


    /**
     * 插入两个用户，用来测试事务管理
     */
    @PostMapping(value = "/person/two")
    public void insertTwo(){
        personService.inserTwo();
    }


    @GetMapping(value = "/person/getsex/{id}")
    public void getSex(@PathVariable("id") Integer id) throws Exception{
        personService.getSex(id);
    }



}
