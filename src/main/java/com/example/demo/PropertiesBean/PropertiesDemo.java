package com.example.demo.PropertiesBean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gray- on 2017/7/31.
 *
 *
 * 常规属性配置，指明配置文件后，通过@Value注入值即可
 */
@RestController
@SpringBootApplication
public class PropertiesDemo {

    @Value("${book.author}")
    private String bookAuthor;
    @Value("${book.name}")
    private String bookName;

    @RequestMapping("/")
    String index(){
        return "book name is "+bookName +" and book author is:" + bookAuthor;
    }



    public static void main(String[] args){
        SpringApplication.run(PropertiesDemo.class, args);
    }

}
