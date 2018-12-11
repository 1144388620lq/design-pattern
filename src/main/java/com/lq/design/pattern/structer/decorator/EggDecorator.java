package com.lq.design.pattern.structer.decorator;

/**
 * @Auther: LQ
 * @Date: 2018/12/11 20:08
 * @Description:
 */
public class EggDecorator extends AbstractDecorator {
    public EggDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    public String getDesc() {
        return super.getDesc()+"加1个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost()+2;
    }
}
