package com.lq.design.pattern.creational.singleton;

/**
 * @Auther: LQ
 * @Date: 2018/12/4 21:46
 * @Description:线程安全 静态内部类模式 懒加载
 */
public class StaticSingleton {

    private StaticSingleton() {
    }

    private static class InnerHolder {
        private final static StaticSingleton instance = new StaticSingleton();
    }

    public StaticSingleton getInstance() {
        return InnerHolder.instance;
    }
}
