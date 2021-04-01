package com.test.decorate2;

/**
 * @Author lggui1
 * @Date 2021/4/1
 * @Description
 **/
public class OpenGrgElockAddImpl2  extends OpenGrgElockAddImpl{
    public OpenGrgElockAddImpl2(OpenElock openElock) {
        super(openElock);
    }

    @Override
    public  void process(){
        super.process();
        chechGrg2();

    }
    public  void chechGrg2(){
        System.out.println("再次对GRG锁进行其他操作");
    }
}
