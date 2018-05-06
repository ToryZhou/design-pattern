package com.job.designpattern.builder;

import lombok.Data;

@Data
public class Person {
    private String head;
    private String body;
    private String armLeft;
    private String armRight;
    private String legLeft;
    private String legRight;

    public static final String HEAD = "head";
    public static final String BODY = "body";
    public static final String ARM_LEFT = "armLeft";
    public static final String ARM_RIGHT = "armRight";
    public static final String LEG_LEFT = "legLeft";
    public static final String LEG_RIGHT = "legRight";

    public void drawHead(String characteristic) {
        this.head = HEAD + characteristic;
    }

    public void drawBody(String characteristic) {
        this.body = BODY + characteristic;
    }

    public void drawArmLeft(String characteristic) {
        this.armLeft = ARM_LEFT + characteristic;
    }

    public void drawArmRight(String characteristic) {
        this.armRight = ARM_RIGHT + characteristic;
    }

    public void drawLegLeft(String characteristic) {
        this.legLeft = LEG_LEFT + characteristic;
    }

    public void drawLegRight(String characteristic) {
        this.legRight = LEG_RIGHT + characteristic;
    }


}
