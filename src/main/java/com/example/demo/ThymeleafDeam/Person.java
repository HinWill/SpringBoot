package com.example.demo.ThymeleafDeam;

/**
 * Created by gray- on 2017/8/1.
 */
public class Person {
    private String name;
    private String age;

    public Person(){
        super();
    }

    public Person(String name, String age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
