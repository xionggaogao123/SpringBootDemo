package com.example.demo.mapper;

import com.example.demo.model.CMP_NO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author keven
 * @date 2018-07-06 下午2:07
 * @Description
 */
@Mapper
@Component
public interface CmpNoMapper {


    @Select("SELECT * FROM CMP_NO")
    List<CMP_NO> listALl();

}
