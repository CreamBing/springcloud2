package com.bing.test.jdbc.ctrl;

import com.bing.test.jdbc.entity.User;
import com.bing.test.jdbc.service.TestUserByJdbcTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

/**
 * <p>Title: UserController</p>
 * <p>Description: </p>
 *
 * @author bing
 * @date 2018/7/25
 * @Company 东方网力
 */
@RestController()
@RequestMapping("/test")
public class UserController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    TestUserByJdbcTemplate testUserByJdbcTemplate;

    @GetMapping("/getAllUsers")
    public String getAllUsers(){
        return testUserByJdbcTemplate.findAll().stream().map(User::getName).collect(Collectors.joining("\n"));
    }
}
