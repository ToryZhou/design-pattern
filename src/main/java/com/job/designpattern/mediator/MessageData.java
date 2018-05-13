package com.job.designpattern.mediator;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class MessageData {
    private static MessageData messageData = new MessageData();

    @Getter
    @Setter
    private List<String> list = new ArrayList<>();

    private MessageData() {
    }

    public static MessageData getInstance() {
        return messageData;
    }
}
