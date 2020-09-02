package com.example.springjpa.controller;


import com.example.springjpa.entity.JpaUser;
import com.example.springjpa.service.JpaUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author aqsus
 */
@RestController
public class JpaUserController {

    @Autowired
    private JpaUserService jpaUserService;

    @GetMapping("/findAll")
    public List<JpaUser> findAll() {
        return jpaUserService.findAll();
    }

    @GetMapping("/insert")
    public String insert(@RequestParam("id") int id,@RequestParam("name") String name,@RequestParam("age") int age) {
        int res = jpaUserService.insertJpaUser(id, name, age);
        if(res >= 1) {
            return "添加成功";
        } else {
            return "添加失败";
        }
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("id") int id) {
        int res = jpaUserService.deleteById(id);
        if(res >= 1) {
            return "删除成功";
        } else {
            return "删除失败";
        }

    }

    @GetMapping("/update")
    public String update(@RequestParam("id") int id,@RequestParam("name") String name,@RequestParam("age") int age) {
        int res = jpaUserService.updateById(id, name, age);
        if(res >= 1) {
            return "修改成功";
        } else {
            return "修改失败";
        }

    }




}
