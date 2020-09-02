package com.example.springjpa.service.impl;

import com.example.springjpa.dao.JpaUserDao;
import com.example.springjpa.entity.JpaUser;
import com.example.springjpa.service.JpaUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author aqsus
 */
@Service
public class JpaUserServiceImpl implements JpaUserService {

    @Autowired
    private JpaUserDao jpaUserDao;

    @Override
    public List<JpaUser> findAll () {
        return jpaUserDao.findAll();
    }

    @Override
    public int insertJpaUser (int id, String name, int age) {
        return jpaUserDao.insertJpaUser(id, name, age);
    }

    @Override
    public int deleteById (int id) {
        return jpaUserDao.deleteById(id);
    }

    @Override
    public int updateById (int id, String name, int age) {
        return jpaUserDao.updateJpaUser(id, name, age);
    }
}
