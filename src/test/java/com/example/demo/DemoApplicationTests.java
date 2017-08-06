package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.RequestMapping;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @RequestMapping("/")
    String index(){
        return "AngularJS";
    }


	@Test
	public void contextLoads() {
        SpringApplication.run(DemoApplicationTests.class);
	}

}
