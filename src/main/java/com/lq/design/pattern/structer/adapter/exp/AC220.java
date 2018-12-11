package com.lq.design.pattern.structer.adapter.exp;

/**
 * @Auther: LQ
 * @Date: 2018/12/11 20:59
 * @Description:被适配者
 */
public class AC220 {
    public int outAC220V() {
        int out = 220;
        System.out.println(" 输出交流电" + out + "V");
        return out;
    }
}
