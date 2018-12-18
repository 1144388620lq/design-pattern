package com.lq.design.pattern.behavier.template;

/**
 * @Auther: LQ
 * @Date: 2018/12/18 20:37
 * @Description:模板方法模式
 */
public class App {
    public static void main(String[] args) {

        UpCourse upCourse1 = new UpCourseOfJava();
        UpCourse upCourse2 = new UpCourseOfC();
        upCourse1.doUp();
        System.out.println(" --------------  ");
        upCourse2.doUp();

    }
}
