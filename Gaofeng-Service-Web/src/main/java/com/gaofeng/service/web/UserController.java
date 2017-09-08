package com.gaofeng.service.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gaofeng.service.api.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @Reference(group = "group", version = "1.0")
    public UserService userService;

    @RequestMapping("/")
    public String index() {

        try {
            this.userService.sayHello("李四");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "hello";
    }
}
