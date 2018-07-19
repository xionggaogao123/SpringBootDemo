package com.example.demo.controller;

import com.example.demo.model.REQ_PUBLIC_DATA;
import com.example.demo.service.PublicDataService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author keven
 * @date 2018-07-13 上午9:49
 * @Description
 */
@RestController
public class PublicDataController {

    @Resource
    private PublicDataService publicDataService;


    @RequestMapping("list-public-data")
    public List<REQ_PUBLIC_DATA> listPublicData() {
        return publicDataService.listAll();
    }

}
