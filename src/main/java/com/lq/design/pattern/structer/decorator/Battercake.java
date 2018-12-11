package com.lq.design.pattern.structer.decorator;

/**
 * @Auther: LQ
 * @Date: 2018/12/11 20:04
 * @Description:
 */
public  class Battercake extends  ABattercake {


    @Override
    public String getDesc() {
        return "大饼";
    }

    @Override
    public int cost() {
        return 3;
    }
}
