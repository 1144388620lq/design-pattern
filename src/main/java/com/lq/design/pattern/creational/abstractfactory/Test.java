package com.lq.design.pattern.creational.abstractfactory;

/**
 * @Auther: LQ
 * @Date: 2018/12/3 21:06
 * @Description:
 */
public class Test {


    public static void main(String[] args) {
        CourseFactory courseFactory = new PythonCourseFactory();
        Article article = courseFactory.getArticle();
        Video video = courseFactory.getVideo();
        article.product();
        video.product();
    }
}
