package com.lq.design.pattern.structer.adapter.exp;

/**
 * @Auther: LQ
 * @Date: 2018/12/11 21:01
 * @Description:
 */
public class PowerAdapter implements DC5 {
    AC220 ac220 = new AC220();

    @Override
    public int outDC5V() {
        int outAC220V = ac220.outAC220V();
        //变压器...
        int adapter = outAC220V / 44;
        System.out.println("输入 " + outAC220V + "V" + " 输出 " + adapter + "V");
        return adapter;
    }
}
