package com.zjs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zjs.dto.User;
import com.zjs.service.UserClient;

@RestController
public class UserController {

    @Autowired
    UserClient userClient;

    @RequestMapping(value = "/getuserinfo", method = RequestMethod.GET)
    public User getuserinfo() {
        return userClient.getuserinfo();
    }
    
    @RequestMapping(value = "/selectUserlist", method = RequestMethod.GET)
    public String selectUserlist() {
        return userClient.selectUserlist();
    }
    
    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public String info() {
        return userClient.info();
    }


}