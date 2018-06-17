package com.example.demo.mapper;

import com.example.demo.model.REQ_ANS_DATA;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author keven
 * @date 2018-06-17 上午10:16
 * @Description
 */
@Mapper
@Component
public interface AnsDataMapper {


    @Select("SELECT * FROM REQ_ANS_DATA")
    List<REQ_ANS_DATA> listData();

}
