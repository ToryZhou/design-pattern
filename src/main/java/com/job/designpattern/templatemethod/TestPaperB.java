package com.job.designpattern.templatemethod;

public class TestPaperB extends TestPaper {

    public static final String ANSWER_ONE = "B";
    public static final String ANSWER_TWO = "C";
    public static final String ANSWER_THREE = "D";

    public String answerOne() {
        return ANSWER_ONE;
    }

    public String answerTwo() {
        return ANSWER_TWO;
    }

    public String answerThree() {
        return ANSWER_THREE;
    }
}
