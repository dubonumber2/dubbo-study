package com.dubo.controller;

import com.dubo.entity.User;
import com.dubo.exterface.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    @RequestMapping("/getUser.action")
    public @ResponseBody
    List<User> getUser(){
        List<User> list=userService.getUser();
        return list;
    }
}