package com.lq.design.pattern.creational.builder;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Auther: LQ
 * @Date: 2018/12/4 20:34
 * @Description:建造者模式
 */
public class Test {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().buildName("go")
                .buildCreated(new Date())
                .buildPrice(new BigDecimal("102.22"))
                .buildUrl("/video/go.avi")
                .build();
        System.out.println(course);

    }
}
