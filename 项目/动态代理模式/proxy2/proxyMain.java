package com.test.proxy2;

import java.lang.reflect.Proxy;

/**
 * @Author lggui1
 * @Date 2021/2/22
 * @Description
 **/
public class proxyMain {

    public static void main(String[] args) {

        Query hello = QueryHandler.newMapperProxy(Query.class);
        System.out.println("main方法输出："+hello.queryName());

        Add hello2 = QueryHandler.newMapperProxy(Add.class);
        System.out.println("main方法输出："+hello2.add());
    }
}
