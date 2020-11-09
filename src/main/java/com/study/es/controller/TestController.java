package com.study.es.controller;


import com.study.es.mapper.JobBossMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
* @description
* @since JDK1.8
* @createTime 2020/11/4 22:36
* @author xie
*/


@Controller
public class TestController {

    @Autowired
    private JobBossMapper mapper;


    @RequestMapping(value = "/test",method = RequestMethod.GET)
    @ResponseBody
    public Object test(){
        return mapper.selectAll().get(0);


    }
}
