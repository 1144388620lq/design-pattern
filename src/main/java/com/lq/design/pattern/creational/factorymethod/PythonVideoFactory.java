package com.lq.design.pattern.creational.factorymethod;

/**
 * @Auther: LQ
 * @Date: 2018/12/3 20:30
 * @Description:
 */
public class PythonVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
