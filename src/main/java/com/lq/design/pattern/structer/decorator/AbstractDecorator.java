package com.lq.design.pattern.structer.decorator;

/**
 * @Auther: LQ
 * @Date: 2018/12/11 20:07
 * @Description:
 */
public class AbstractDecorator extends ABattercake {
    private ABattercake aBattercake;

    public AbstractDecorator(ABattercake aBattercake) {
        this.aBattercake = aBattercake;
    }

    @Override
    public String getDesc() {
        return this.aBattercake.getDesc();
    }

    @Override
    public int cost() {
        return this.aBattercake.cost();
    }
}
