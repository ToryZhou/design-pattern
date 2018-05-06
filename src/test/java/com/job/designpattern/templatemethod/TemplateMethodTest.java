package com.job.designpattern.templatemethod;

import org.junit.Assert;
import org.junit.Test;

public class TemplateMethodTest {

    @Test
    public void test() {
        TestPaperA studentA = new TestPaperA();
        studentA.testQuestionOne();
        studentA.testQuestionTwo();
        studentA.testQuestionThree();
        Assert.assertEquals(TestPaper.TEST_QUESTION_ONE + TestPaperA.ANSWER_ONE, studentA.getAnswer1());
        Assert.assertEquals(TestPaper.TEST_QUESTION_TWO + TestPaperA.ANSWER_TWO, studentA.getAnswer2());
        Assert.assertEquals(TestPaper.TEST_QUESTION_THREE + TestPaperA.ANSWER_THREE, studentA.getAnswer3());

        TestPaperB studentB = new TestPaperB();
        studentB.testQuestionOne();
        studentB.testQuestionTwo();
        studentB.testQuestionThree();
        Assert.assertEquals(TestPaper.TEST_QUESTION_ONE + TestPaperB.ANSWER_ONE, studentB.getAnswer1());
        Assert.assertEquals(TestPaper.TEST_QUESTION_TWO + TestPaperB.ANSWER_TWO, studentB.getAnswer2());
        Assert.assertEquals(TestPaper.TEST_QUESTION_THREE + TestPaperB.ANSWER_THREE, studentB.getAnswer3());
    }
}
