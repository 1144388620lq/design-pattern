package com.lq.design.pattern.behavier.template;

/**
 * @Auther: LQ
 * @Date: 2018/12/18 20:35
 * @Description:
 */
public class UpCourseOfC extends UpCourse {
    @Override
    void givenPrice() {
        System.out.println(" 120元 ");
    }

    @Override
    void video() {
        System.out.println(" C语言课程 ");
    }

    @Override
    boolean haveArticle() {
        return true;
    }

    @Override
    void writrArticles() {
        System.out.println(" 有C++的一些文章 ");
    }
}
