package com.test.proxy2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author lggui1
 * @Date 2021/2/22
 * @Description
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Insert {
    String value();
}
