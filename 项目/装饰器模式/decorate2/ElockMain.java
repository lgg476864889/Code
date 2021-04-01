package com.test.decorate2;

/**
 * @Author lggui1
 * @Date 2021/4/1
 * @Description
 **/
public class ElockMain {
    public static void main(String[] args) {
        OpenElock o=new OpenElockImpl();
        OpenElock p=new OpenGrgElockAddImpl2(o);
        p.process();
    }
}
