package com.lq.design.pattern.behavier.command;

/**
 * @Auther: LQ
 * @Date: 2018/12/20 21:55
 * @Description:
 */
public class CloseVideoCommand implements Command {
    Video video;

    public CloseVideoCommand(Video video) {
        this.video = video;
    }

    @Override
    public void execute() {
        video.close();
    }
}
