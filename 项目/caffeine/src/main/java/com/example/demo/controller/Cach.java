package com.example.demo.controller;

import com.github.benmanes.caffeine.cache.Cache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author lggui1
 * @Date 2021/1/12
 * @Description
 **/
@RestController
public class Cach {

    @Autowired
    private Cache<String, Object> caffeineCache;

    /**
     * 通过CacheManager配合spring的缓存注解使用
     *
     * @param token
     * @return
     */
    @GetMapping("/token")
    @Cacheable(value = "checkToken", key = "#token")
    public String a(@RequestParam("token") String token) {
        System.out.println("读取方法");
        String word = "缓存了：" + token;
        return word;
    }

    /**
     * 通过caffeineCache手动配置缓存
     */
    @GetMapping("/token2")
    public String a2(@RequestParam("token2") String token2) {
        String key1 = "key1";
        String ss = (String) caffeineCache.getIfPresent(key1);
        if (ss == null) {
            System.out.println("读取方法");
            String word = "没有使用缓存，现在缓存进去：" + token2;
            caffeineCache.put(key1, "这是读取的缓存数据"+token2);
            return word;
        }
        System.out.println("读取缓存");
        return ss;
    }
//
//    Cache<String, String> cache = Caffeine.newBuilder()
//            .expireAfterWrite(1, TimeUnit.MINUTES)
//            .expireAfterAccess(1, TimeUnit.MINUTES)
//            .maximumSize(10000)
//            .build();
//
//    @GetMapping("/cach")
//    public String cach(@RequestParam("w") String w) {
//        String key = "all_airport";
//
//        // 根据key查询一个缓存，如果没有返回NULL
//        String graph = cache.getIfPresent(key);
//        if (StringUtils.isEmpty(graph)) {
//            cache.put(key, "我存：" + w);
//            System.out.println("没有缓存");
//            return "没有缓存";
//        } else {
//            System.out.println("——————————————————————————————————————————————————有缓存————————————————————————————————————————————————");
//            System.out.println("有缓存");
//            System.out.println(graph);
//            return graph;
//        }
//    }


}
