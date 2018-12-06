package com.lq.design.pattern.structer;

/**
 * @Auther: LQ
 * @Date: 2018/12/6 21:43
 * @Description:
 */
public class GiftFaced {

    private PointCheckService pointCheckService = new PointCheckService();

    private StockCheckService stockCheckService = new StockCheckService();

    private PayService payService = new PayService();


    public void exchangeGift() {
        if (pointCheckService.checkPoint()) {
            if (stockCheckService.checkStock()) {
                if (payService.toPay()) {
                    System.out.println(" 恭喜您 成功兑换礼物！ ");
                }
            }
        }
    }

}
