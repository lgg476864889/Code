package com.test.decorator;

/**
 * @Author lggui1
 * @Date 2021/4/1
 * @Description 装饰器模式
 *
 *
 * 业务接口Component operation方法
 * 业务接口实现类ConcreteComponent
 *
 * 抽象装饰实现类Decorator（也是实现Component，主要是在构造方法传入的参数类型是Component   m，operation调用的是m.operation(也就是接口的operation)）
 *
 * 具体装饰实现类ConcreteDecorator （实现的是Decorator，构造方法传入也是Component m，重写operation方法，
 * 在operation方法里面做其他事情，同时调用父类的operation方法
 * 这个父类就是Decorator,而Decorator调用的是传入的Component m，
 * 所以在使用时，多态创建的是哪个具体装饰类就是调用哪个装饰类的装饰方法和本身的业务实现类方法）
 **/
public class DecoratorPatternMain {

    public static void main(String[] args) {
        //业务实现类
        Component p = new ConcreteComponent();
       // p.operation();
        System.out.println("---------------------------------");
        //具体装饰类 利用传入的业务实现类型调用业务方法，再调用本身方法
        Component d = new ConcreteDecorator(p);
        d.operation();
    }
}
