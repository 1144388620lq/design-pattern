package com.lq.design.pattern.behavier.memento;

/**
 * @Auther: LQ
 * @Date: 2018/12/20 21:28
 * @Description:备忘录模式
 */
public class App {
    public static void main(String[] args) {
        ArticleMementoManager articleMementoManager = new ArticleMementoManager();

        Article article1 = new Article("十面埋伏1", "十面埋伏111111111");
        ArticleMemento articleMemento1 = article1.doSave();
        articleMementoManager.addArticleMemento(articleMemento1);
        article1.setContent("update1");
        ArticleMemento articleMemento = article1.doSave();
        articleMementoManager.addArticleMemento(articleMemento);
        article1.undoSave(articleMemento);
        article1.undoSave(articleMemento1);
        System.out.println(article1);
//        System.out.println(articleMemento33);

    }
}
