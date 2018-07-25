package com.bing.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * <p>Title: TestDataSourceApplication</p>
 * <p>Description: </p>
 *
 * @author bing
 * @date 2018/4/28
 * @Company 东方网力
 */
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages={"com.bing.conf.*", "com.bing.test.*"})
public class TestDataSourceApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestDataSourceApplication.class, args);
    }
}
