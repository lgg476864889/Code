package com.test.decorate2;

/**
 * @Author lggui1
 * @Date 2021/4/1
 * @Description 开锁流程的实现
 **/
public class OpenElockImpl implements OpenElock {
    @Override
    public void process() {
        System.out.println("开锁流程开始");
    }

    public OpenElockImpl() {
        System.out.println("调用了OpenElockImpl构造方法！");
    }
}
