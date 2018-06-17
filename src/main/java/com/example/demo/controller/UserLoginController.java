package com.example.demo.controller;

import com.example.demo.model.UserLogin;
import com.example.demo.service.UserLoginService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author keven
 * @date 2018-06-17 上午10:09
 * @Description
 */
@RestController
public class UserLoginController {


    @Resource
    public UserLoginService userLoginService;


    @RequestMapping("/user-find-by-id")
    public UserLogin findById(Long id) {
        return userLoginService.findById(id);
    }

}
