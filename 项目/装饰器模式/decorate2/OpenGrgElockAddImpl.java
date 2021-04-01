package com.test.decorate2;

/**
 * @Author lggui1
 * @Date 2021/4/1
 * @Description 具体装饰角色
 **/
public class OpenGrgElockAddImpl extends  OpenGRGElockImpl  {

    public OpenGrgElockAddImpl(OpenElock openElock) {
        super(openElock);
    }

    @Override
    public  void process(){
        super.process();
        chechGrg();

    }
    public  void chechGrg(){
        System.out.println("对GRG锁进行其他操作");
    }
}
