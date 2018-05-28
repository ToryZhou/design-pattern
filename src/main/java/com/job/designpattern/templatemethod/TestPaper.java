package com.job.designpattern.templatemethod;

import lombok.Data;

@Data
public abstract class TestPaper {
    private String answer1;
    private String answer2;
    private String answer3;

    public static final String TEST_QUESTION_ONE = "testQuestionOne:";
    public static final String TEST_QUESTION_TWO = "testQuestionTwo:";
    public static final String TEST_QUESTION_THREE = "testQuestionThree:";

    public void testQuestionOne() {
        this.answer1 = TEST_QUESTION_ONE + answerOne();
    }

    public void testQuestionTwo() {
        this.answer2 = TEST_QUESTION_TWO + answerTwo();
    }

    public void testQuestionThree() {
        this.answer3 = TEST_QUESTION_THREE + answerThree();
    }

    protected abstract String answerOne();

    protected abstract String answerTwo();

    protected abstract String answerThree();

}
