package com.lq.design.pattern.creational.singleton;

/**
 * @Auther: LQ
 * @Date: 2018/12/6 04:00
 * @Description:天然的线程安全 防止序列化 反射等 单例的最佳实践之一.
 */
public enum EnumSingleton {

    INSTANCE {
        protected String name;

        protected void set(String name) {
            this.name = name;
        }

        protected String get() {
            return this.name;
        }
    };

    protected abstract void set(String name);

    protected abstract String get();

    private Object data;


    EnumSingleton() {

    }

    public Object getData() {
        System.out.println(INSTANCE.get());
        return data;
    }

}
