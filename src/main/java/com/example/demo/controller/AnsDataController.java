package com.example.demo.controller;

import com.example.demo.model.CMP_NO;
import com.example.demo.model.REQ_ANS_DATA;
import com.example.demo.model.REQ_ANS_FLOW;
import com.example.demo.service.AnsDataService;
import com.example.demo.service.AnsFlowService;
import com.example.demo.service.CmpNoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author keven
 * @date 2018-06-17 上午10:18
 * @Description
 */
@RestController
public class AnsDataController {


    @Resource
    private AnsDataService ansDataService;

    @Resource
    private AnsFlowService ansFlowService;

    @Resource
    private CmpNoService cmpNoService;


    @RequestMapping("/list-req-data")
    public List<REQ_ANS_DATA> reqAnsDataList() {
        return ansDataService.listData();
    }


    @RequestMapping("/list-flow")
    public List<REQ_ANS_FLOW> listFlow() {
        return ansFlowService.listFlow();
    }


    @RequestMapping("/list-cmp")
    public List<CMP_NO> cmpNoList() {
        return cmpNoService.listAll();
    }

}
