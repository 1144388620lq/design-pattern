package com.lq.design.pattern.structer.component;

/**
 * @Auther: LQ
 * @Date: 2018/12/12 22:12
 * @Description:组合模式
 */
public class App {
    public static void main(String[] args) {
        CatalogComponent linuxCourse = new Course("linux课程", 112.22);
        CatalogComponent windowsCourse = new Course("windows课程", 52);

        CatalogComponent javaCouseLog = new CourseCataLog("java课程目录", 2);
        CatalogComponent javaCourse1 = new Course("java分布式", 52);
        CatalogComponent javaCourse2 = new Course("java设计模式", 42);
        CatalogComponent javaCourse3 = new Course("java电商", 22);
        CatalogComponent javaCourse4 = new Course("java电商二期", 51);
        javaCouseLog.add(javaCourse1);
        javaCouseLog.add(javaCourse2);
        javaCouseLog.add(javaCourse3);
        javaCouseLog.add(javaCourse4);
        CatalogComponent javaCouseLog2 = new CourseCataLog("java课程2目录", 3);

        CatalogComponent mainLog = new CourseCataLog("特别教育网课程主目录", 1);
        mainLog.add(linuxCourse);
        mainLog.add(windowsCourse);
        mainLog.add(javaCouseLog);
        javaCouseLog.add(javaCouseLog2);
        javaCouseLog2.add(javaCourse2);
        javaCouseLog2.add(javaCourse1);


        mainLog.print();


    }
}

