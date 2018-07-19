package com.example.demo.mapper;

import com.example.demo.model.NORMATIVE_WORD;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author keven
 * @date 2018-07-16 下午5:37
 * @Description
 */
@Mapper
@Component
public interface NormativeWordMapper {


    @Select("SELECT * FROM NORMATIVE_WORD")
    List<NORMATIVE_WORD> listAll();

}
