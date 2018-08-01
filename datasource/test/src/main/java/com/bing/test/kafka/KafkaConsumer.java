package com.bing.test.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class KafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = "test",containerFactory = "jsonKafkaListenerContainerFactory")
    public void listen(List<String> contents){
        LOGGER.info("\ntopic[test]开始消费\n");
        contents.forEach(e -> LOGGER.info("\t"+e+"\n"));
        LOGGER.info("topic[test]结束消费\n");
    }
}
