package cn.facedupid.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.client.RestTemplate;

/**
 * @author timothy
 * @data 2021年06月04日 10:50 上午
 */
@Configuration
public class RedisConfig {

    @Bean
    public StringRedisTemplate getStringRedisTemplate(){
        return new StringRedisTemplate();
    }
}
