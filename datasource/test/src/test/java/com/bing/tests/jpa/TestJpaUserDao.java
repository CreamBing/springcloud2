package com.bing.tests.jpa;

import com.bing.test.TestDataSourceApplication;
import com.bing.test.jpa.dao.UserRepository;
import com.bing.test.jpa.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * <p>Title: TestJpaUserDao</p>
 * <p>Description: </p>
 *
 * @author bing
 * @date 2018/7/24
 * @Company 东方网力
 */
@SpringBootTest(classes = TestDataSourceApplication.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class TestJpaUserDao {

    @Autowired
    UserRepository userRepository;

    @Test
    public void saveUser(){
        User user = new User();
        user.setName("zb");
        userRepository.save(user);
    }
}
