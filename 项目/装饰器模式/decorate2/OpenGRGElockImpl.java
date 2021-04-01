package com.test.decorate2;

/**
 * @Author lggui1
 * @Date 2021/4/1
 * @Description 抽象装饰角色
 **/
public class OpenGRGElockImpl implements  OpenElock {

    private  OpenElock openElock;

    public OpenGRGElockImpl(OpenElock openElock) {
        this.openElock = openElock;
    }

    @Override
    public void process() {
        openElock.process();
    }
}
