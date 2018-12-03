package com.lq.design.pattern.creational.abstractfactory;

/**
 * @Auther: LQ
 * @Date: 2018/12/3 21:04
 * @Description:
 */
public class JavaCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
