package com.zy.Test;

import com.sun.xml.internal.bind.v2.model.core.ID;
import com.zy.imperial.court.entity.Emp;
import com.zy.imperial.court.entity.EmpExample;
import com.zy.imperial.court.mapper.EmpMapper;
import org.apache.ibatis.annotations.Mapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @author 2277352725
 * @version 1.0
 * @title ConnTest
 * @description <>
 * @create 2023/5/16 12:05
 */
@ExtendWith(SpringExtension.class)
@ContextConfiguration(value = {"classpath:/spring-persist.xml"})
@MapperScan(value = {"com.zy.imperial.court.mapper"})
public class ConnTest {
    @Autowired
    private DataSource dataSource;
    @Autowired
    private EmpMapper empMapper;
    @Test
    public void Test01(){
        try {
            Connection connection = dataSource.getConnection();
            System.out.println  (connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void Test2(){
        List<Emp> emps = empMapper.selectByExample(new EmpExample());
        emps.forEach(System.out::println);
    }
}
