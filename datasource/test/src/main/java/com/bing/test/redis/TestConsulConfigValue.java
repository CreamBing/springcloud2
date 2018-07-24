package com.bing.test.redis;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringBootConfiguration;

/**
 * <p>Title: TestConsulConfig</p>
 * <p>Description: </p>
 *
 * @author bing
 * @date 2018/7/24
 * @Company 东方网力
 */
@SpringBootConfiguration
@Data
public class TestConsulConfigValue {

    @Value("${spring.redis.database}")
    private String database;


}
