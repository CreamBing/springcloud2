package com.bing.redis_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Title: TestZookeeperValue</p>
 * <p>Description: </p>
 *
 * @author bing
 * @date 2018/4/28
 * @Company 东方网力
 */
@RestController
@RequestMapping("/zookeeper")
public class TestZookeeperValue {

    @Autowired
    private ZookeeperValue zookeeperValue;

    @Autowired
    private TestRedisUtil testRedisUtil;

    @GetMapping("/getZookeeperValue")
    public String getZookeeperValue(){
        System.out.println(zookeeperValue.getFoo());
        return "Hello,"+zookeeperValue.getFoo();
    }

    @GetMapping("/setRedisTestKey")
    public void setRedisTestKey(){
        testRedisUtil.setTestKey();
    }

    @GetMapping("/getRedisTestKey")
    public String getRedisTestKey(){
        return testRedisUtil.getTestKey();
    }
}
