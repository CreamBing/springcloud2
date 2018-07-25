package com.bing.test.jpa.service;

import com.bing.test.jpa.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>Title: UserService</p>
 * <p>Description: </p>
 *
 * @author bing
 * @date 2018/7/24
 * @Company 东方网力
 */
@Service
public class UserService {

    /**
     解决循环依赖问题,让spring容器先将datasource初始化
     org.springframework.boot.actuate.autoconfigure.jdbc.DataSourceHealthIndicatorAutoConfiguration
     和
     org.springframework.boot.autoconfigure.jdbc.DataSourceInitializerInvoker
     */
    @Autowired
    private UserRepository userRepository;
}
