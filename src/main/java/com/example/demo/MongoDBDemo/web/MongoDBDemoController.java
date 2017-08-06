package com.example.demo.MongoDBDemo.web;

import com.example.demo.MongoDBDemo.dao.PersonRepository;
import com.example.demo.MongoDBDemo.domain.Location;
import com.example.demo.MongoDBDemo.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * Created by gray- on 2017/8/5.
 */
@RestController

public class MongoDBDemoController {
    @Autowired
    PersonRepository personRepository;


    @RequestMapping("/save")
    public Person save(){
        Person person = new Person("wyf", 32);

        Collection<Location> locations = new LinkedHashSet<>();

        Location loc1 = new Location("上海", "2009");
        Location loc2 = new Location("合肥", "2009");
        Location loc3 = new Location("山东", "2009");
        Location loc4 = new Location("北京", "2009");

        locations.add(loc1);
        locations.add(loc2);
        locations.add(loc3);
        locations.add(loc4);

        person.setLocations(locations);

        return personRepository.save(person);
    }

    @RequestMapping("/q1")
    public Person q1(String name){
        return personRepository.findByName(name);
    }


    @RequestMapping("/q2")
    public List<Person> q2(Integer age){
        return personRepository.withQueryFindByAge(age);
    }
}
