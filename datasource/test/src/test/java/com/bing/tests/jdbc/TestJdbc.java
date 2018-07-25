package com.bing.tests.jdbc;

import com.bing.test.TestDataSourceApplication;
import com.bing.test.jdbc.service.TestUserByJdbcTemplate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * <p>Title: TestJdbc</p>
 * <p>Description: </p>
 *
 * @author bing
 * @date 2018/7/25
 * @Company 东方网力
 */
@SpringBootTest(classes = TestDataSourceApplication.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class TestJdbc {

    @Autowired
    TestUserByJdbcTemplate testUserByJdbcTemplate;

    @Test
    public void queryAllUser(){
        testUserByJdbcTemplate.findAll().forEach(System.out::println);

    }


}
