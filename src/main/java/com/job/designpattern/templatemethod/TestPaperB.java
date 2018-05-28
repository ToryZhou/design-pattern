package com.job.designpattern.templatemethod;

public class TestPaperB extends TestPaper {

    public static final String ANSWER_ONE = "B";
    public static final String ANSWER_TWO = "C";
    public static final String ANSWER_THREE = "D";

    protected String answerOne() {
        return ANSWER_ONE;
    }

    protected String answerTwo() {
        return ANSWER_TWO;
    }

    protected String answerThree() {
        return ANSWER_THREE;
    }
}
