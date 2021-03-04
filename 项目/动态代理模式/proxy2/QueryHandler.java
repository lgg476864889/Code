package com.test.proxy2;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author lggui1
 * @Date 2021/2/22
 * @Description
 **/
public class QueryHandler implements InvocationHandler {

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String sql="";
        Annotation[] annotations = method.getAnnotations();
        if(annotations[0].annotationType().equals(Select.class)){
            Select annotation = method.getAnnotation(Select.class);
            sql=annotation.value();
            System.out.println(sql);
        }
        else if(annotations[0].annotationType().equals(Insert.class)){
            Insert annotation = method.getAnnotation(Insert.class);
            sql=annotation.value();
            System.out.println(sql);
        }

        return sql;
    }

    public static <T> T newMapperProxy(Class<T> interfaceClass) {
        ClassLoader classLoader = interfaceClass.getClassLoader();
        Class<?>[] interfaces = new Class[]{interfaceClass};
        QueryHandler proxy = new QueryHandler();
        return (T) Proxy.newProxyInstance(classLoader, interfaces, proxy);
    }
}
