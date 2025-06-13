package com.SpringBootJpaEntityCPkWithEmbeddable.controller;

import com.SpringBootJpaEntityCPkWithEmbeddable.entity.User;
import com.SpringBootJpaEntityCPkWithEmbeddable.entity.UserCk;
import com.SpringBootJpaEntityCPkWithEmbeddable.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping(path="/test-jpa")
    public User getUser(){
        UserCk userCk=new UserCk("sairam","sairam8276@gmail.com");
        User user=new User(userCk,"9550378276");
        userService.saveUser(user);
        User output1=userService.getUser(1l);
        return output1;
    }

    @GetMapping(path="/read-jpa")
    public User getUser2(){
        User output1=userService.getUser(1l);
        return output1;
    }
}
