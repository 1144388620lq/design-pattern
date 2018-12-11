package com.lq.design.pattern.structer.adapter.v1;

/**
 * @Auther: LQ
 * @Date: 2018/12/11 20:51
 * @Description:
 */
public class Adapter extends Adapted implements Target {
    @Override
    public void request() {
        super.adaptRequest();
    }
}
