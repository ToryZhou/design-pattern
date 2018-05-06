package com.job.designpattern.templatemethod;

public class TestPaperA extends TestPaper {

    public static final String ANSWER_ONE = "A";
    public static final String ANSWER_TWO = "B";
    public static final String ANSWER_THREE = "C";

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
