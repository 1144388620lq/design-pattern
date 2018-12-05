package com.lq.design.pattern.creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;

/**
 * @Auther: LQ
 * @Date: 2018/12/4 21:36
 * @Description:通过多线程debug手动干预线程执行顺序可以得出线程不安全哈
 */
public class App {
    public static void main(String[] args) throws Exception {

//        Thread t1 = new Thread(new T());
//        Thread t2 = new Thread(new T());
//        t1.start();
//        t2.start();
//        System.out.println("end");
        HungrySingleton instance = HungrySingleton.getInstance();
        System.out.println(instance.hashCode());
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("testxx"));
        out.writeObject(instance);
        out.flush();
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("testxx"));
        HungrySingleton o = (HungrySingleton) in.readObject();
        System.out.println(o.hashCode());
        out.close();
        in.close();

        EnumSingleton.INSTANCE.set("lili");
        String s = EnumSingleton.INSTANCE.get();
        System.out.println(s);

        //懒汉模式不能很好处理反射攻击
        Constructor<HungrySingleton> declaredConstructor = HungrySingleton.class.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);
        HungrySingleton hungrySingleton = declaredConstructor.newInstance();


    }
}
