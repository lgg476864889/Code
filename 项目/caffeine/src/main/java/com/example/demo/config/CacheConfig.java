package com.example.demo.config;

/**
 * @Author lggui1
 * @Date 2021/3/10
 * @Description
 **/

import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import org.springframework.cache.CacheManager;
import org.springframework.cache.caffeine.CaffeineCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

/**
 * Cache配置類，用于缓存数据
 * 缓存数据的配置
 */
@Configuration
public class CacheConfig {

    //配置CacheManager  这个是配合spring cahche注解使用的
    @Bean(name = "caffeineCacheManager")
    public CacheManager cacheManagerWithCaffeine() {

        CaffeineCacheManager cacheManager = new CaffeineCacheManager();
        Caffeine caffeine = Caffeine.newBuilder()
                //cache的初始容量值
                .initialCapacity(100)
                //maximumSize用来控制cache的最大缓存数量，maximumSize和maximumWeight(最大权重)不可以同时使用，
                .maximumSize(1000)
                //最后一次写入或者访问后过久过期
                .expireAfterAccess(500, TimeUnit.SECONDS);
        //创建或更新之后多久刷新,refreshAfterWrite需要设置cacheLoader
        //    .refreshAfterWrite(10, TimeUnit.SECONDS);
        //cacheManager.setCacheLoader(load);
        cacheManager.setCaffeine(caffeine);
        cacheManager.setAllowNullValues(false);//是否允许值为空
        return cacheManager;
    }
    //这个是用来手动设置缓存
    @Bean
    public Cache<String, Object> caffeineCache() {
        return Caffeine.newBuilder()
                // 设置最后一次写入或访问后经过固定时间过期
                .expireAfterWrite(60, TimeUnit.SECONDS)
                // 初始的缓存空间大小
                .initialCapacity(100)
                // 缓存的最大条数
                .maximumSize(1000)
                .build();
    }


}

