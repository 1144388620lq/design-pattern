package com.lq.design.pattern.structer.adapter.v2;

/**
 * @Auther: LQ
 * @Date: 2018/12/11 20:48
 * @Description:
 */
public class TargetImpl implements Target {


    @Override
    public void request() {
        System.out.println(" origin request ");
    }
}
