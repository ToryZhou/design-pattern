package com.job.designpattern.templatemethod;

public class TestPaperA extends TestPaper {

    public static final String ANSWER_ONE = "A";
    public static final String ANSWER_TWO = "B";
    public static final String ANSWER_THREE = "C";

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
