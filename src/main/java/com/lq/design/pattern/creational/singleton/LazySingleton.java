package com.lq.design.pattern.creational.singleton;

/**
 * @Auther: LQ
 * @Date: 2018/12/4 21:33
 * @Description:线程不安全写法 懒汉模式
 */
public class LazySingleton {

    private static LazySingleton instance = null;

    private LazySingleton() {
    }

    public static  LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
