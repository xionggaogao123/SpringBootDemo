package com.example.demo.service;

import com.example.demo.mapper.PublicDataMapper;
import com.example.demo.model.REQ_PUBLIC_DATA;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author keven
 * @date 2018-07-13 上午9:42
 * @Description
 */
@Service
public class PublicDataService {


    @Resource
    public PublicDataMapper publicDataMapper;



    public List<REQ_PUBLIC_DATA> listAll() {
        return publicDataMapper.listAll();
    }

}
