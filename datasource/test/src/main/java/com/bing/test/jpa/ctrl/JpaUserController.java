package com.bing.test.jpa.ctrl;

import com.bing.test.jpa.entity.User;
import com.bing.test.jpa.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Title: JpaUserController</p>
 * <p>Description: </p>
 *
 * @author bing
 * @date 2018/7/25
 * @Company 东方网力
 */
@RestController
@RequestMapping("/test/jpa")
public class JpaUserController {

    private static final Logger LOGGER = LoggerFactory.getLogger(JpaUserController.class);

    @Autowired
    UserService userService;

    /**
     *枚举常量
     */
    public  enum RESCODE{
        /**
         *成功操作
         */
        SUCCESS,
        /**
         *失败操作
         */
        FAIL
    }

    @GetMapping("/add")
    public String addUser(@RequestParam("name") String name){
        String result = RESCODE.SUCCESS.toString();
        User user = new User();
        user.setName(name);
        try {
            userService.insert(user);
        }catch (Exception e){
            LOGGER.error("jpa插入用户失败!原因[{}]",e.getMessage());
            result = RESCODE.FAIL.toString();
        }
        return result;
    }

}
