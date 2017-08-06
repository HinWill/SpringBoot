package com.example.demo.OracleDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * Created by gray- on 2017/8/4.
 */
@SpringBootApplication
@EnableCaching //开启缓存支持
public class PersonApplication {


    public static void main(String[] args){
        SpringApplication.run(PersonApplication.class, args);
    }
}
