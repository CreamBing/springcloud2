package com.bing.conf;


import org.springframework.data.redis.core.BoundHashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * 提供redis 相关操作
 */
@Component
public class RedisUtil {

    private static RedisTemplate<String, Object> redisTemplate ;

    public RedisUtil(RedisTemplate<String, Object> redisTemplate){
        this.redisTemplate =redisTemplate;
    }

    /**
     * 写入缓存
     *
     * @param key
     * @param value
     */
    public  void set(final String key, final Object value, long time ,TimeUnit timeUnit) {
        redisTemplate.opsForValue().set(key, value.toString(), time, timeUnit);
    }

    /**
     * 写入hahs缓存
     *
     * @param key
     * @param value
     */
    public  void hSet(final String hashkey,final String key, final Object value) {
        redisTemplate.boundHashOps(hashkey).put(key,value);
    }

    /**
     * 写入hash缓存
     *
     * @param key
     * @param value
     */
    public  void hSet(final String hashKey,final String key, final Object value, long time ,TimeUnit timeUnit) {
        BoundHashOperations<String, Object, Object> ops = redisTemplate.boundHashOps(hashKey);
        ops.put(key,value);
        ops.expire(time,timeUnit);
    }
    public  Object hGet(final String hashkey,final String key) {
        return  redisTemplate.boundHashOps(hashkey).get(key);
    }
    public  boolean hExists(final String hashkey,final String key) {
        return  redisTemplate.boundHashOps(hashkey).hasKey(key);
    }

    /**
     * 写入缓存
     *
     * @param key
     * @param value
     */
    public  void set(final String key, final Object value) {
        redisTemplate.opsForValue().set(key, value.toString());
    }


    /**
     * 读取缓存
     *
     * @param key
     * @param clazz
     * @return
     */
    @SuppressWarnings("unchecked")
    public  <T> T get(final String key, Class<T> clazz) {
        return (T) redisTemplate.boundValueOps(key).get();
    }

    /**
     * 读取缓存
     *
     * @param key
     * @return
     */
    public  Object getObj(final String key) {
        return redisTemplate.boundValueOps(key).get();
    }

    /**
     * 删除，根据key精确匹配
     *
     * @param key
     */
    public  void del(final String... key) {
        redisTemplate.delete(Arrays.asList(key));
    }
    public  void hDel(final String hashKey,final String... key) {
        //redisTemplate.boundHashOps(hashkey).delete(Arrays.asList(key));
    	redisTemplate.boundHashOps(hashKey).delete(key);
    }

    /**
     * 批量删除，根据key模糊匹配
     *
     * @param pattern
     */
    public  void delpn(final String... pattern) {
        for (String kp : pattern) {
            redisTemplate.delete(redisTemplate.keys(kp + "*"));
        }
    }

    /**
     * key是否存在
     *
     * @param key
     */
    public  boolean exists(final String key) {
        return redisTemplate.hasKey(key);
    }
    
    public Set<String> keys(String pattern){
    	Set<String> keyS = redisTemplate.keys(pattern);
    	if(keyS != null) {
    		for(String str:keyS) {
    			System.out.println("redis key:"+str);
    		}
    	}
    	return keyS;
    }
}
