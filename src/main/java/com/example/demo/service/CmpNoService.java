package com.example.demo.service;

import com.example.demo.mapper.CmpNoMapper;
import com.example.demo.model.CMP_NO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author keven
 * @date 2018-07-06 下午2:08
 * @Description
 */
@Service
public class CmpNoService {

    @Resource
    private CmpNoMapper cmpNoMapper;


    public List<CMP_NO> listAll() {
        return cmpNoMapper.listALl();
    }

}
