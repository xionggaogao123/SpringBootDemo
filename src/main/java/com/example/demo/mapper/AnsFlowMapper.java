package com.example.demo.mapper;

import com.example.demo.model.REQ_ANS_FLOW;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author keven
 * @date 2018-07-02 下午2:47
 * @Description
 */
@Mapper
@Component
public interface AnsFlowMapper {


    @Select("SELECT * FROM REQ_ANS_FLOW")
    List<REQ_ANS_FLOW> listFlow();

}
