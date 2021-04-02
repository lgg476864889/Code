package com.test.observe;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author lggui1
 * @Date 2021/4/1
 * @Description
 **/
public class CopyObserver implements Observer {

    private String webName;
    private String article;
    @Override
    public void update(Observable o, Object arg) {
        // 更新文章
       copyArticle(o);
    }

    public void copyArticle(Observable o){
        JavaStackObservable javaStackObservable = (JavaStackObservable) o;
        this.article = javaStackObservable.getArticle();
        System.out.printf("文学网站%s，文章已复制：%s\n", this.webName, this.article);
    }

    public CopyObserver(String webName) {
        this.webName = webName;
    }
}
