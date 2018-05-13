package com.job.designpattern.command;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class CommandData {
    private static CommandData commandData = new CommandData();

    @Getter
    @Setter
    private List<String> bakeList = new ArrayList<>();

    @Getter
    @Setter
    private List<String> logList = new ArrayList<>();

    private CommandData() {

    }

    public static CommandData getInstance() {
        return commandData;
    }
}
