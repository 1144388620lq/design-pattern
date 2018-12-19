package com.lq.design.pattern.behavier.stratge;

/**
 * @Auther: LQ
 * @Date: 2018/12/19 20:44
 * @Description:策略模式
 */
public class App {
    public static void main(String[] args) {

        PromotionActivity banjiaPromotionActivity = new PromotionActivity(new BanJiaPromotion());
        PromotionActivity manjianPromotionActivity = new PromotionActivity(new ManJianPromotion());
        PromotionActivity fanxianPromotionActivity = new PromotionActivity(new FanXianPromotion());

        banjiaPromotionActivity.doPromotion();
        manjianPromotionActivity.doPromotion();
        fanxianPromotionActivity.doPromotion();
    }
}
