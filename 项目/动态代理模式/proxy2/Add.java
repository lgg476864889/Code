package com.test.proxy2;

/**
 * @Author lggui1
 * @Date 2021/2/22
 * @Description
 **/
public interface Add {
    @Insert("insert user (name) values(1)")
    String  add();
}
