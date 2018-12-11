package com.lq.design.pattern.structer.adapter.exp;

/**
 * @Auther: LQ
 * @Date: 2018/12/11 21:04
 * @Description:适配器模式
 */
public class App {
    public static void main(String[] args) {

        DC5 dc5 = new PowerAdapter();
       dc5.outDC5V();
    }
}
