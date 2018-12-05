package com.lq.design.pattern.creational.singleton;

import java.io.Serializable;

/**
 * @Auther: LQ
 * @Date: 2018/12/6 03:50
 * @Description:
 */
public class HungrySingleton implements Serializable {

    private final static HungrySingleton instance;

    static {
        instance = new HungrySingleton();
    }

    private HungrySingleton() {
        if (instance != null) {
            throw new RuntimeException("不支持反射创建此对象");
        }
    }

    public final static HungrySingleton getInstance() {
        return instance;
    }

    //防止序列化破坏
    public Object readResolve() {
        return instance;
    }
}
