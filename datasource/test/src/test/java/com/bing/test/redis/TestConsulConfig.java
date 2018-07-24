package com.bing.test.redis;

import com.bing.test.TestDataSourceApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
/**
 * <p>Title: TestConsulConfig</p>
 * <p>Description: </p>
 *
 * @author bing
 * @date 2018/7/24
 * @Company 东方网力
 */
@SpringBootTest(classes = TestDataSourceApplication.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class TestConsulConfig {

    @Autowired
    TestConsulConfigValue testConsulConfig;

    @Test
    public void getValue(){
        System.out.println(testConsulConfig.getDatabase());
    }
}
