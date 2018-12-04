package com.lq.design.pattern.creational.singleton;

/**
 * @Auther: LQ
 * @Date: 2018/12/4 21:33
 * @Description:线程安全写法 懒汉双重检查锁模式
 */
public class DoubleCheckSingleton {

    private volatile static DoubleCheckSingleton instance = null;

    private DoubleCheckSingleton() {
    }

    public static DoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
