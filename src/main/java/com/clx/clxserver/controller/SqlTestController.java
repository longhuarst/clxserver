package com.clx.clxserver.controller;


import com.clx.clxserver.domain.SqlTest;
import com.clx.clxserver.service.SqlTestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/SqlTest")
public class SqlTestController {

    @Resource
    SqlTestService sqlTestService;

    @RequestMapping(value = "/test")
    public SqlTest getSqlTest(){
        return sqlTestService.getSqlTest();
    }





}
