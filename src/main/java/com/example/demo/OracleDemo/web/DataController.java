package com.example.demo.OracleDemo.web;

import com.example.demo.OracleDemo.dao.PersonRepository;
import com.example.demo.OracleDemo.domain.Person;
import com.example.demo.OracleDemo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by gray- on 2017/8/4.
 */

@RestController
public class DataController {

    @Autowired
    PersonRepository personRepository;

    @Autowired
    PersonService personService;


    //-------------------------------------------------------------数据库测试


    /**
     * 保存
     * save支持批量保存：
     *
     *
     * 删除
     * 支持使用id删除对象、批量删除以及删除全部
     *
     */


    /**
     * 返回用户列表
     * @return
     */
    @GetMapping(value = "/personlist")
    public List<Person> personList(){
        return personRepository.findAll();
    }

    /**
     * 根据id查询用户
     * @param id
     * @return
     */

    @GetMapping(value = "/person/{id}")
    public Person findPersonById(@PathVariable("id") Integer id){
        return personRepository.findOne(id);
    }



    /**
     * 根据地址返回用户列表
     * @param address
     * @return
     */
    @GetMapping(value = "/personlist/{address}")
    public List<Person> personList_address(@PathVariable("address") String address){
        return personRepository.findByAddress(address);
    }

    /**
     * 根据用户名和地址返回用户列表
     * @param name
     * @param address
     * @return
     */
    @GetMapping(value = "/person/{name}/{address}")
    public Person findperson(@PathVariable("name") String name,
                             @PathVariable("address") String address){

        System.out.println("使用用户名和地址进行查询");

        //使用@Query查询，参数按照名称绑定
        return personRepository.withNameAndAddressQuery(name, address);
        //使用方法名查询
        //return personRepository.findByNameAndAddress(name, address);
    }

    @PostMapping(value = "/person")
    public Person save(Person person){
        return personRepository.save(person);
    }


    /**
     * 测试排序
     */
    @GetMapping(value = "/person/sort")
    public List<Person> sort(){
        return personRepository.findAll(new Sort(Sort.Direction.ASC, "age"));
    }


    /**
     * 测试分页
     */
    @GetMapping(value = "/person/page")
    public Page<Person> page(){
        return personRepository.findAll(new PageRequest(1,1));
    }



    //-------------------------------------------------------------缓存测试

    /**
     * 为保存、更新用户做缓存
     * @param person
     * @return
     */
    @PostMapping("/person/put")
    public Person put(Person person){
        return personService.save(person);
    }


    /**
     * 为单一用户信息做缓存
     * @param person
     * @return
     */

    @RequestMapping("/person/able")
    public Person cacheable(Person person){
        return personService.findOne(person);
    }


}
