package com.test.proxy2;

/**
 * @Author lggui1
 * @Date 2021/2/22
 * @Description
 **/
public interface Query {
    @Select("select name from user ")
    String  queryName();
}
