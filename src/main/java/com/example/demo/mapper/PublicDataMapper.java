package com.example.demo.mapper;

import com.example.demo.model.REQ_PUBLIC_DATA;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author keven
 * @date 2018-07-13 上午9:41
 * @Description
 */
@Mapper
@Component
public interface PublicDataMapper {

    @Select("SELECT * FROM REQ_PUBLIC_DATA")
    List<REQ_PUBLIC_DATA> listAll();

}
