package com.example.demo.service;

import com.example.demo.mapper.UserLoginMapper;
import com.example.demo.model.UserLogin;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author keven
 * @date 2018-06-17 上午9:24
 * @Description
 */
@Service
public class UserLoginService {

    @Resource
    private UserLoginMapper userLoginDao;


    public UserLogin findById(Long id) {
        return userLoginDao.selectById(id);
    }
}
