package com.lq.design.pattern.structer.adapter.v2;



/**
 * @Auther: LQ
 * @Date: 2018/12/11 20:49
 * @Description:
 */
public class App {
    public static void main(String[] args) {
        Target target = new TargetImpl();
        target.request();
        Target adapterTarget = new Adapter();
        adapterTarget.request();
    }
}
