package cn.facedupid.service.impl;

import cn.facedupid.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author timothy
 * @data 2021年06月04日 3:21 下午
 */
@Service
public class RedisServiceImpl implements RedisService {

    @Autowired
    private StringRedisTemplate strRedisTemplate;

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public void set(String key, String value) {
        strRedisTemplate.opsForValue().set(key, value);
    }

    @Override
    public String get(String key) {
        return strRedisTemplate.opsForValue().get(key);
    }

    /**
     * 设置过期时间
     *
     * @param expire 过期时间
     * @return
     */
    @Override
    public boolean expire(String key, long expire) {
        return strRedisTemplate.expire(key, expire, TimeUnit.SECONDS);
    }

    /**
     * 删除key
     */
    @Override
    public void remove(String key) {
        strRedisTemplate.delete(key);
    }

    /**
     * 设置自增步长
     *
     * @param delta 自增步长
     */
    @Override
    public Long increment(String key, long delta) {
        return strRedisTemplate.opsForValue().increment(key, delta);
    }

    @Override
    public boolean publish(String channel, String message) {
        redisTemplate.convertAndSend("channel-tim01", "balabalabalabala");
        return true;
    }
}
