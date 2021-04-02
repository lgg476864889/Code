package com.test.observe;

import java.util.Observable;

/**
 * @Author lggui1
 * @Date 2021/4/1
 * @Description  观察者模式，观察目标
 *  这个类就是被观察的目标
 *  继承的父类里面有一个方法notifyObservers 这个方法会根据是否改变状态来执行观察者的update，但是会在执行之前用锁锁住本身
 **/
public class JavaStackObservable extends Observable {
    //文章
    private String article;

    /**
     * 发表文章
     * @param article
     */
    public void publish(String article){
        // 发表文章
        this.article = article;

        // 改变状态
        this.setChanged();

        // 通知所有观察者
        this.notifyObservers();
    }

    public String getArticle() {
        return article;
    }
}
