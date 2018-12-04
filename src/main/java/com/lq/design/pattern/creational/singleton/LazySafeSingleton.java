package com.lq.design.pattern.creational.singleton;

/**
 * @Auther: LQ
 * @Date: 2018/12/4 21:33
 * @Description:线程安全写法 懒汉模式
 */
public class LazySafeSingleton {

    private static LazySafeSingleton instance = null;

    private LazySafeSingleton() {
    }

    public synchronized static LazySafeSingleton getInstance() {
        if (instance == null) {
            instance = new LazySafeSingleton();
        }
        return instance;
    }
}
