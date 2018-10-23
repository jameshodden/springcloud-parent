package com.consumer.web;

import com.consumer.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 消费者示例
 */
@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate=new RestTemplate();

    @RequestMapping("/findOne")
    public User findOne(){
        User user=restTemplate.getForObject("http://spring-cloud-provider/user/2",User.class);
        return user;
    }
}
