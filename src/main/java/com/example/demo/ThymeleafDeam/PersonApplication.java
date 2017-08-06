package com.example.demo.ThymeleafDeam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gray- on 2017/8/1.
 *
 * 练习使用ThymeleafDeam模型
 */

@Controller
@SpringBootApplication
public class PersonApplication {

    @RequestMapping("/")
    public String index(Model model) {
        Person single = new Person("wangzhan", "man");

        List<Person> people = new ArrayList<>();

        Person p1 = new Person("11", "xxx");
        Person p2 = new Person("21", "xxx");
        Person p3 = new Person("31", "xxx");
        Person p4 = new Person("41", "xxx");

        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);

        model.addAttribute("singlePerson", single);
        model.addAttribute("people", people);

        return "index";
    }

    @RequestMapping("/ang")
    public String ang(){
        return "AngularJS";
    }


    public static void main(String[] args ){
        SpringApplication.run(PersonApplication.class,args);
    }

}
