package com.job.designpattern.interpreter;

public class Speed extends Expression {
    @Override
    public void execute(String key, double value) {
        String speed = "";
        if (value < 500) {
            speed = "fast";
        } else if (value >= 1000) {
            speed = "slow";
        } else {
            speed = "medium";
        }
        PlayData playData = PlayData.getInstance();
        playData.setPlay(playData.getPlay()+ " " + speed);
    }
}
