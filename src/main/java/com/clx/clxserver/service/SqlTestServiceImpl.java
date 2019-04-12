package com.clx.clxserver.service;


import com.clx.clxserver.dao.SqlTestRepository;
import com.clx.clxserver.domain.SqlTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class SqlTestServiceImpl implements  SqlTestService {

    @Autowired
    SqlTestRepository sqlTestRepository;


    @Override
    @Transactional
    public SqlTest getSqlTest(){
        return sqlTestRepository.getSqlTest();
    }


}
