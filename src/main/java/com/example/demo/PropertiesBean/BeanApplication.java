package com.example.demo.PropertiesBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;

/**
 * Created by gray- on 2017/7/31.
 *
 *  使用@ConfigurationProperties 将properties 和一个Bean 及其属性关联
 *  从而实现类型安全的配置
 *
 */


@RestController
@SpringBootApplication
public class BeanApplication {
    @Autowired
    private bean bean;

    @RequestMapping("/")
    String index(){
        return "author name = "+bean.getName()+"   author sex = "+bean.getSex();
    }


    public static void main(String[] args){
        SpringApplication.run(BeanApplication.class,args);
    }
}
