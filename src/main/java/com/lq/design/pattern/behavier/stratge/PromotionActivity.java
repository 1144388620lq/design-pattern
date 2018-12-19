package com.lq.design.pattern.behavier.stratge;

/**
 * @Auther: LQ
 * @Date: 2018/12/19 20:45
 * @Description:
 */
public class PromotionActivity {
    private Promotion promotion;

    public PromotionActivity(Promotion promotion) {
        this.promotion = promotion;
    }

    public void doPromotion() {
        promotion.doPromotion();
    }
}
