package com.lq.design.pattern.creational.singleton;

/**
 * @Auther: LQ
 * @Date: 2018/12/4 21:36
 * @Description:通过多线程debug手动干预线程执行顺序可以得出线程不安全哈
 */
public class App {
    public static void main(String[] args) {

        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();
        System.out.println("end");


    }
}
