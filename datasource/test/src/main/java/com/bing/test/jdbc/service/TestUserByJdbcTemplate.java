package com.bing.test.jdbc.service;

import com.alibaba.druid.pool.DruidDataSource;
import com.bing.test.jdbc.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>Title: TestUserByJdbcTemplate</p>
 * <p>Description: </p>
 *
 * @author bing
 * @date 2018/7/25
 * @Company 东方网力
 */
@Service
public class TestUserByJdbcTemplate {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestUserByJdbcTemplate.class);

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<User> findAll(){
        if(jdbcTemplate.getDataSource() instanceof DruidDataSource){
            LOGGER.info("验证确实通过@Bean注入了DruiDataSource数据源");
        }
        String sql = "select * from user" ;
        List<User> list = jdbcTemplate.query(sql,new BeanPropertyRowMapper(User.class)) ;
        return list ;
    }

}
