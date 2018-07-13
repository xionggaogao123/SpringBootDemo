package com.example.demo.service;

import com.example.demo.mapper.AnsFlowMapper;
import com.example.demo.model.REQ_ANS_FLOW;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author keven
 * @date 2018-07-02 下午2:49
 * @Description
 */
@Service
public class AnsFlowService {


    @Resource
    private AnsFlowMapper ansFlowMapper;


    public List<REQ_ANS_FLOW> listFlow() {
        return ansFlowMapper.listFlow();
    }
}
