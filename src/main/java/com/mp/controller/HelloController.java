package com.mp.controller;

import com.mp.entity.User;
import com.mp.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/test")
public class HelloController {
    @Autowired
    private UserMapper userMapper;

    @PostMapping(value = "/insert")
    public void insert(@RequestBody User user) {
        userMapper.insert(user);
    }

    @GetMapping(value = "/delete")
    public void delete(@RequestParam(value = "id", required = true) long id) {
        userMapper.deleteById(id);
    }
}
