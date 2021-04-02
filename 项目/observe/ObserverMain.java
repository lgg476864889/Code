package com.test.observe;

/**
 * @Author lggui1
 * @Date 2021/4/1
 * @Description 测试观察者模式类
 *
 *观察者模式主要是分两个角色，1.观察者，2.观察目标（被观察者）
 * 观察者主要实现抽象观察者的更新方法update（自定义的抽象观察者名字可以不一样,这个例子是继承java类的）
 * 观察目标主要实现抽象观察目标的通知，也包括新增观察者和删除观察者的方法；
 * 观察目标的通知会调用观察者的update
 **/
public class ObserverMain {
    public static void main(String[] args) {
        // 创建一个观察目标
        JavaStackObservable javaStackObservable = new JavaStackObservable();

        // 添加观察者
        javaStackObservable.addObserver(new ReaderObserver("小明"));
        javaStackObservable.addObserver(new ReaderObserver("小张"));
        javaStackObservable.addObserver(new ReaderObserver("小爱"));

        javaStackObservable.addObserver(new CopyObserver("超级读书"));
        javaStackObservable.addObserver(new CopyObserver("酷爱读书"));
        // 发表文章
        javaStackObservable.publish("什么是观察者模式？");
        // 发表文章
        javaStackObservable.publish("JVM调优推荐！！");
        System.out.println("我在发布之后做其他事情");
    }
}
