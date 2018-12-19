package com.lq.design.pattern.behavier.stratge;

/**
 * @Auther: LQ
 * @Date: 2018/12/19 20:43
 * @Description:
 */
public class ManJianPromotion implements Promotion {

    @Override
    public void doPromotion() {
        System.out.println(" 满100 减10 ");
    }
}
