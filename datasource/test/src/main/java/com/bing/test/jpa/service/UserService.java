package com.bing.test.jpa.service;

import com.bing.test.jpa.dao.UserRepository;
import com.bing.test.jpa.entity.User;
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

    @Autowired
    private UserRepository userRepository;

    public void insert(User user){
        userRepository.save(user);
    }

}
