package com.bing.conf;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * <p>Title: RedisConf</p>
 * <p>Description: </p>
 *
 * @author bing
 * @date 2018/4/28
 * @Company 东方网力
 */
@SpringBootConfiguration
public class RedisConf {

    @Bean(name = "redisTemplate")
    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory factory) {
        RedisTemplate<String, Object> template = new RedisTemplate<>();
        RedisSerializer<String> stringSerializer = new StringRedisSerializer();
        RedisSerializer<Object> JacksonSerializer = new Jackson2JsonRedisSerializer<Object>(Object.class);
        GenericJackson2JsonRedisSerializer genericJacksonSerializer = new GenericJackson2JsonRedisSerializer();
        template.setConnectionFactory(factory);
        template.setHashKeySerializer(stringSerializer);
        template.setKeySerializer(stringSerializer);
        template.setHashValueSerializer(genericJacksonSerializer);
        template.setValueSerializer(JacksonSerializer);
        return template;
    }

}
