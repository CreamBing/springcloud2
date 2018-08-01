package com.bing.tests.kafka;

import com.alibaba.fastjson.JSON;
import com.bing.test.TestDataSourceApplication;
import lombok.Data;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.Serializable;

@SpringBootTest(classes = TestDataSourceApplication.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class TestKafka {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    @Test
    public void send2Kafka(){
        kafkaTemplate.send("test","hello");
        Person p = new Person();
        p.setAge(24);
        p.setName("CreamBing");
        //由于produce初始化的时候value的序列化采用的是StringSerializer,所以这里只能传string
        kafkaTemplate.send("test", JSON.toJSONString(p));
    }


    @Data
    static class Person implements Serializable{
        private String name;
        private int age;
    }

}
