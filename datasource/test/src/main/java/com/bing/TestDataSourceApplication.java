package com.bing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

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
public class TestDataSourceApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestDataSourceApplication.class, args);
    }
}
