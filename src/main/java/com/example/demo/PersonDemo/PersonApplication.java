package com.example.demo.PersonDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gray- on 2017/8/2.
 *
 * 数据库测试类
 */
@RestController
@SpringBootApplication
public class PersonApplication {


    @RequestMapping("/ang")
    public String ang(){
        return "AngularJS";
    }



    public static void main(String[] args){
        SpringApplication.run(PersonApplication.class,args);
    }

}
