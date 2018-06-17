package com.example.demo.mapper;

import com.example.demo.model.UserLogin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/**
 * @author keven
 * @date 2018-06-17 上午9:22
 * @Description
 */
@Mapper
@Component
public interface UserLoginMapper {

    @Select("SELECT * FROM UserLogin WHERE id=#{id}")
    UserLogin selectById(Long id);

}
