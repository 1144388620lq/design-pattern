package com.lq.design.pattern.creational.factorymethod;

/**
 * @Auther: LQ
 * @Date: 2018/12/3 20:29
 * @Description:
 */
public class FEVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new FEVideo();
    }
}
