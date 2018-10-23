package com.provider.web;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.provider.pojo.User;
@RestController
public class ProviderController {
 
    @RequestMapping(value="/user/{userId}")
    public User findUserById(@PathVariable Integer userId) {
        //调用service层获取用户信息
        return new User("james", 12);
    }
}