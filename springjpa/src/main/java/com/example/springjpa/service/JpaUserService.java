package com.example.springjpa.service;

import com.example.springjpa.entity.JpaUser;

import java.util.List;

/**
 * @author aqsus
 */
public interface JpaUserService {

    /**
     *  用于查找全部
     * @return 存放JpaUser的List集合
     */
    List<JpaUser> findAll();

    /**
     *  用于添加JpaUser
     * @param id
     * @param name
     * @param age
     * @return
     */
    int insertJpaUser(int id, String name, int age);

    /**
     *  通过id来删除JpaUser
     * @param id
     * @return
     */
    int deleteById(int id);

    /**
     *  通过id来修改JpaUser
     * @param id
     * @param name
     * @param age
     * @return
     */
    int updateById(int id, String name, int age);

}
