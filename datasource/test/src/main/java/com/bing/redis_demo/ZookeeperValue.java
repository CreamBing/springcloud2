package com.bing.redis_demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * <p>Title: ZookeeperValue</p>
 * <p>Description: </p>
 *
 * @author bing
 * @date 2018/4/28
 * @Company 东方网力
 */
@Component
@RefreshScope
public class ZookeeperValue {

    @Value("${foo}")
    private String foo;

    public String getFoo() {
        return foo;
    }

    public void setFoo(String foo) {
        this.foo = foo;
    }
}
