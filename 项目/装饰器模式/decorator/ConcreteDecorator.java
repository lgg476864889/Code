package com.test.decorator;

/**
 * @Author lggui1
 * @Date 2021/4/1
 * @Description 具体装饰角色
 **/
public class ConcreteDecorator  extends Decorator{

    public ConcreteDecorator(Component component) {
        super(component);
    }
    public void operation() {
        super.operation();
        addedFunction();
    }
    public void addedFunction() {
        System.out.println("为具体构件角色增加额外的功能addedFunction()");
    }
}
