package com.job.designpattern.interpreter;

public class Scale extends Expression {
    @Override
    public void execute(String key, double value) {
        String scale = "";
        switch ((int) value) {
            case 1:
                scale = "bass";
                break;
            case 2:
                scale = "mediant";
                break;
            case 3:
                scale = "alt";
                break;
        }
        PlayData playData = PlayData.getInstance();
        playData.setPlay(playData.getPlay() + " " + scale);
    }
}
