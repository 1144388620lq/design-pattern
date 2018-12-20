package com.lq.design.pattern.behavier.memento;

import java.util.Stack;

/**
 * @Auther: LQ
 * @Date: 2018/12/20 21:17
 * @Description:
 */
public class ArticleMementoManager {

    private final Stack<ArticleMemento> articleMementoStack = new Stack<>();



    public ArticleMemento getArticleMemento() {
        return articleMementoStack.pop();
    }

    public void addArticleMemento(ArticleMemento articleMemento) {
        ArticleMemento articleMemento1 = articleMementoStack.push(articleMemento);
    }
}
