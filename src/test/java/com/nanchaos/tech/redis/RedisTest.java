package com.nanchaos.tech.redis;

import com.nanchaos.tech.TechValidationApplication;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;

import javax.annotation.Resource;

/**
 * Default Description
 *
 * @author nanchaos
 * @date 2025/1/8
 * @time 17:21
 */
@Slf4j
@SpringBootTest(classes = TechValidationApplication.class)
public class RedisTest {
    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void testAdd(){
        // 对应 redis-cli: SET REDIS_KEY 'this is redis value'
        stringRedisTemplate.opsForValue().set("REDIS_KEY", "this is redis value");
    }

    @Test
    public void testGet(){
        // 对应 redis-cli: GET REDIS_KEY
        stringRedisTemplate.opsForValue().get("REDIS_KEY");
    }
}
