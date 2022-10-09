package com.example.demomybatis.controller;

import com.example.demomybatis.model.dao.mapper.MUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {

    @Resource
    private MUser userMapper;

    @GetMapping(value = "/test")
    public String getUserList(@RequestParam Integer id) {
        System.out.println(userMapper.findById(id));
        return "success";
    }
}
