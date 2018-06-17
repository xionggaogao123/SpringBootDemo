package com.example.demo.service;

import com.example.demo.mapper.AnsDataMapper;
import com.example.demo.model.REQ_ANS_DATA;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author keven
 * @date 2018-06-17 上午10:19
 * @Description
 */
@Service
public class AnsDataService {

    @Resource
    private AnsDataMapper ansDataDao;


    public List<REQ_ANS_DATA> listData () {
        return ansDataDao.listData();
    }

}
