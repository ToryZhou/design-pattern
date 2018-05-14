package com.job.designpattern.interpreter;

import lombok.Getter;
import lombok.Setter;

public class PlayData {
    private static PlayData playData = new PlayData();

    @Getter
    @Setter
    private String play = "";

    private PlayData() {
    }

    public static PlayData getInstance() {
        return playData;
    }
}
