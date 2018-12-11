package com.lq.design.pattern.structer.decorator;

/**
 * @Auther: LQ
 * @Date: 2018/12/11 20:03
 * @Description:装饰着模式
 */
public class App {
    public static void main(String[] args) {
        ABattercake aBattercake;
        aBattercake = new Battercake();
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new SuaggerDecorator(aBattercake);
        aBattercake = new SuaggerDecorator(aBattercake);
        aBattercake = new SuaggerDecorator(new EggDecorator(aBattercake));
        //是不是很像jdk里的io流呢
        System.out.println(aBattercake.getDesc() + "  " + aBattercake.cost());

    }
}
