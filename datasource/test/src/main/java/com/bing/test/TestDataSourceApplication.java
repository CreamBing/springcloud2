package com.bing.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

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
@EnableConfigurationProperties
public class TestDataSourceApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestDataSourceApplication.class, args);
    }
}
