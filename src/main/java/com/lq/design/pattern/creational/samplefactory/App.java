package com.lq.design.pattern.creational.samplefactory;

/**
 * @Auther: LQ
 * @Date: 2018/12/2 20:05
 * @Description:
 */
public class App {
    //jdk源码相关代码 简单工厂模式  jdk最佳实践  Class.forname   Calendar.getInstance等等

    //v1
  /*  public static void main(String[] args) {
        Video video = VideoFactory.getVideo("java");
        video.product();
    }*/
    //v2
    public static void main(String[] args) {
        Video video = VideoFactory.getVideo(PythonVideo.class);
        video.product();
    }

}
