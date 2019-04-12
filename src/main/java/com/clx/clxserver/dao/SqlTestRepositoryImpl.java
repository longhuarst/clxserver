package com.clx.clxserver.dao;

import com.clx.clxserver.domain.SqlTest;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Repository
public class SqlTestRepositoryImpl implements SqlTestRepository{


    @PersistenceContext
    EntityManager entityManager;

    @Override
    public SqlTest getSqlTest(){
        //编写jpql语句，进行执行回去所需数据
        List<SqlTest> resultList  = entityManager.createQuery("FROM sql_test")
                .setFirstResult(0)
                .setMaxResults(1)
                .getResultList();

        if (resultList.size() == 0){
            return null;
        }

        return resultList.get(0);
    }
}
