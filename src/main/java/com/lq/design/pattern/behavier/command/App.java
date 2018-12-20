package com.lq.design.pattern.behavier.command;

/**
 * @Auther: LQ
 * @Date: 2018/12/20 21:59
 * @Description:命令模式
 */
public class App {
    public static void main(String[] args) {
        Video video = new Video("demo视频");
        CloseVideoCommand closeVideoCommand = new CloseVideoCommand(video);
        OpenVideoCommand openVideoCommand = new OpenVideoCommand(video);

        Staff staff = new Staff();
        staff.addCommand(openVideoCommand);
        staff.addCommand(closeVideoCommand);
        staff.executeCommand();

    }
}
