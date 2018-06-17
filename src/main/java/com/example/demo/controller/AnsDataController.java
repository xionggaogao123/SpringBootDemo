package com.example.demo.controller;

import com.example.demo.mapper.AnsDataMapper;
import com.example.demo.model.REQ_ANS_DATA;
import com.example.demo.service.AnsDataService;
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


    @RequestMapping("/list-req-data")
    public List<REQ_ANS_DATA> reqAnsDataList() {
        return ansDataService.listData();
    }

}
