package com.lq.design.pattern.behavier.template;

/**
 * @Auther: LQ
 * @Date: 2018/12/18 20:35
 * @Description:
 */
public class UpCourseOfJava extends UpCourse {

    @Override
    void givenPrice() {
        System.out.println(" 100元 ");
    }

    @Override
    void video() {
        System.out.println(" java课程 ");
    }
}
