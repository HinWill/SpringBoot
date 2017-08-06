package com.example.demo.RedisDemo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by gray- on 2017/8/6.
 */

@Repository
public class PersonDao {

    //springboot已经配置了以下的bean此处直接注入

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Autowired
    RedisTemplate<Object, Object> redisTemplate;


    @Resource(name = "StringRedisTemplate")
    ValueOperations<String, String> valOpsStr;



}
