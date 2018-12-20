package com.lq.design.pattern.behavier.command;

/**
 * @Auther: LQ
 * @Date: 2018/12/20 21:55
 * @Description:
 */
public class Video {
    private String name;


    public Video(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void open() {
        System.out.println(" 打开视频 " + this.name);
    }

    public void close() {
        System.out.println(" 关闭视频 " + this.name);
    }
}

