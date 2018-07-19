package com.example.demo.controller;

import com.example.demo.model.NORMATIVE_WORD;
import com.example.demo.service.NormativeWordService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author keven
 * @date 2018-07-16 下午5:42
 * @Description
 */
@RestController
public class NormativeWordController {

    @Resource
    public NormativeWordService normativeWordService;


    @RequestMapping("list-normative-word")
    public List<NORMATIVE_WORD> listAll() {
        return normativeWordService.listAll();
    }

}
