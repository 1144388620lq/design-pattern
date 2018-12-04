package com.lq.design.pattern.creational.singleton;

/**
 * @Auther: LQ
 * @Date: 2018/12/4 21:35
 * @Description:
 */
public class T implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "  " + LazySingleton.getInstance().hashCode());
    }
}
