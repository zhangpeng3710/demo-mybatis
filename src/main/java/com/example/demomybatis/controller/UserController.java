package com.example.demomybatis.controller;

import com.example.demomybatis.model.dao.mapper.MUser;
import com.google.gson.Gson;
import org.springframework.boot.json.GsonJsonParser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {

    @Resource
    private MUser userMapper;

    @GetMapping(value = "/test")
    public String getUserList(@RequestParam int id) {
        Gson gson = new Gson();
        String result = gson.toJson(userMapper.findAllId());

        System.out.println(userMapper.findAllId());
        return result;
    }
}
