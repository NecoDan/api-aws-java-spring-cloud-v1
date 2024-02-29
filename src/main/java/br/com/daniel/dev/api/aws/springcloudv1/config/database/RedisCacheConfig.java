package br.com.daniel.dev.api.aws.springcloudv1.config.database;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;

import java.time.Duration;

@EnableCaching
@Configuration
public class RedisCacheConfig {

}
