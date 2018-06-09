package com.job.designpattern.command;

import java.util.ArrayList;
import java.util.List;

public class Waiter {

    private List<Command> orders = new ArrayList<>();

    public void setOrder(Command command) {
        if (BakeChickenWingCommand.class.getSimpleName().equals(command.getClass().getSimpleName())) {
            CommandData.getInstance().getLogList().add("No chicken wing");
        } else {
            orders.add(command);
            CommandData.getInstance().getLogList().add(Thread.currentThread().getStackTrace()[1].getMethodName() + command.getClass().getSimpleName());
        }
    }

    public void cancelOrder(Command command) {
        orders.remove(command);
        CommandData.getInstance().getLogList().add(Thread.currentThread().getStackTrace()[1].getMethodName() + command.getClass().getSimpleName());
    }

    public void inform() {
        orders.forEach(Command::executeCommand);
    }
}
