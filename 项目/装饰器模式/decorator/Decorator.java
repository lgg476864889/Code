package com.test.decorator;

/**
 * @Author lggui1
 * @Date 2021/4/1
 * @Description  抽象装饰角色
 **/
public class Decorator implements Component {

    private Component component;
    public Decorator(Component component) {
        this.component = component;
    }
    public void operation() {
        component.operation();
    }
}
