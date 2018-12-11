package com.lq.design.pattern.structer.adapter.v2;

/**
 * @Auther: LQ
 * @Date: 2018/12/11 20:55
 * @Description:
 */
public class Adapter implements Target {
    Adapted adapted = new Adapted();

    @Override
    public void request() {
        adapted.adaptRequest();
    }
}
