package com.test.observe;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author lggui1
 * @Date 2021/4/1
 * @Description  观察者
 **/

public class ReaderObserver implements Observer {

        private String name;

        private String article;

        //观察者的更新方法在观察目标更改时会调用它
        @Override
        public void update(Observable o, Object arg) {
            // 更新文章
            updateArticle(o);
        }

        private void updateArticle(Observable o) {
            JavaStackObservable javaStackObservable = (JavaStackObservable) o;
            this.article = javaStackObservable.getArticle();
            System.out.printf("我是读者：%s，文章已更新为：%s\n", this.name, this.article);
        }

    public ReaderObserver(String name) {
        this.name = name;
    }
}
