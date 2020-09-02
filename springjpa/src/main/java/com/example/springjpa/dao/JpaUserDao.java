package com.example.springjpa.dao;

import com.example.springjpa.entity.JpaUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author aqsus
 */
public interface JpaUserDao extends JpaRepository<JpaUser, Integer> {

    /**
     * 用于查找所有数据
     * @return 返回List集合
     */
    @Override
    List<JpaUser> findAll();

    @Modifying
    @Transactional
    @Query(value = "insert into jpa_user value(?, ?, ?)", nativeQuery = true)
    int insertJpaUser(@Param("id") int id, @Param("name")String name, @Param("age")int age);

    @Modifying
    @Transactional
    @Query(value = "delete from jpa_user where id=:id")
    int deleteById(@Param("id") int id);


    @Modifying
    @Transactional
    @Query(value = "update jpa_user set name=:name, age=:age where id=:id")
    int updateJpaUser(@Param("id") int id,@Param("name") String name,@Param("age") int age);
}
