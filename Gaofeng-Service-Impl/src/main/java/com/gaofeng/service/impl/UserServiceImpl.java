package com.gaofeng.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.gaofeng.service.api.UserService;


@Service(group = "group", version = "1.0")
public class UserServiceImpl implements UserService {

    public void sayHello(String name) throws Exception {
        System.out.println("hello ---> " + name);
    }

}
