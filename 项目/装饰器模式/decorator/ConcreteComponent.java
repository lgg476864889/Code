package com.test.decorator;

/**
 * @Author lggui1
 * @Date 2021/4/1
 * @Description 具体构件
 **/
public class ConcreteComponent implements Component  {

    public ConcreteComponent() {
        System.out.println("创建具体构件角色");
    }
    public void operation() {
        System.out.println("调用具体构件角色的方法operation()");
    }
}
