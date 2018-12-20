package com.lq.design.pattern.behavier.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: LQ
 * @Date: 2018/12/20 21:58
 * @Description:
 */
public class Staff {
    private List<Command> commandList = new ArrayList<Command>();

    public void addCommand(Command command) {
        commandList.add(command);
    }

    public void removeCommand(Command command) {
        commandList.remove(command);
    }

    public void executeCommand() {
        commandList.forEach(e -> e.execute());
    }
}
