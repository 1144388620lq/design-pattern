package com.lq.design.pattern.behavier.template;

/**
 * @Auther: LQ
 * @Date: 2018/12/18 20:27
 * @Description:
 */
public abstract class UpCourse {

    //上架课程的大体框架
    final void doUp() {
        //交给子类
        video();
        //交给子类
        givenPrice();
        //钩子方法
        if (haveArticle()) {
            writrArticles();
        }
        //不许重写
        audit();
    }

    private final void audit() {
        System.out.println(" 管理员审核通过;课程上架成功 ");
    }

    void writrArticles() {
    }

    ;

    boolean haveArticle() {
        return false;
    }

    ;

    abstract void givenPrice();

    abstract void video();
}
