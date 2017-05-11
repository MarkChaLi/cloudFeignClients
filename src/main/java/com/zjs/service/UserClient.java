package com.zjs.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zjs.dto.User;

@FeignClient("cloud-feign-service")//扫描获取暴露的服务
public interface UserClient {

    @RequestMapping(method = RequestMethod.POST, value = "/getuser")
    public User getuserinfo();
    
    @RequestMapping(method = RequestMethod.POST, value = "/selectUserlist")
    public String selectUserlist();
    
    @RequestMapping(method = RequestMethod.POST, value = "/info")
    public  String  info();

}