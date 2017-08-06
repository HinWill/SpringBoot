package com.example.demo.OracleDemo.dao;

import com.example.demo.OracleDemo.domain.Person;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * Created by gray- on 2017/8/4.
 */
public interface PersonRepository extends JpaRepository<Person, Integer> {

    /**
     * 根据address查询列表
     *
     * @param name
     * @return
     */
    List<Person> findByAddress(String name);


    /**
     * 根据name和address查询
     *
     * @param name
     * @param address
     * @return
     */
    @Cacheable
    Person findByNameAndAddress(String name, String address);

    /**
     * 使用@Query查询，参数按照名称绑定
     * @param name
     * @param address
     * @return
     */

    @Query("select p from Person p where p.name= :name and p.address= :address")
    Person withNameAndAddressQuery(@Param("name") String name,
                                   @Param("address") String address);


}
