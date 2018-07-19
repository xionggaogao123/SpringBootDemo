package com.example.demo.service;

import com.example.demo.mapper.NormativeWordMapper;
import com.example.demo.model.NORMATIVE_WORD;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author keven
 * @date 2018-07-16 下午5:38
 * @Description
 */
@Service
public class NormativeWordService {


    @Resource
    public NormativeWordMapper normativeWordMapper;


    public List<NORMATIVE_WORD> listAll() {
        return normativeWordMapper.listAll();
    }


}
