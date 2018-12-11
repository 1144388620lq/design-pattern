package com.lq.design.pattern.structer.decorator;

/**
 * @Auther: LQ
 * @Date: 2018/12/11 20:08
 * @Description:
 */
public class SuaggerDecorator extends AbstractDecorator {
    public SuaggerDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }
    @Override
    public String getDesc() {
        return super.getDesc()+"加1个香肠";
    }

    @Override
    public int cost() {
        return super.cost()+3;
    }
}
