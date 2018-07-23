package com.bing.redis_demo;

import com.bing.conf.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * <p>Title: TestRedisUtil</p>
 * <p>Description: </p>
 *
 * @author bing
 * @date 2018/4/28
 * @Company 东方网力
 */
@Component
public class TestRedisUtil {

    @Autowired
    private RedisUtil redisUtil;

    public void setTestKey(){
        redisUtil.set("test","hello");
    }

    public String getTestKey(){
        return redisUtil.get("test",String.class);
    }

}
