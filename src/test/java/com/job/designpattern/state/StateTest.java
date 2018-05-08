package com.job.designpattern.state;

import org.junit.Assert;
import org.junit.Test;

public class StateTest {

    @Test
    public void test() {
        Work work = new Work();

        work.setHour(9);
        work.writeProgram();
        Assert.assertEquals(ForenoonState.class.getSimpleName(), work.getStateName());

        work.setHour(10);
        work.writeProgram();
        Assert.assertEquals(ForenoonState.class.getSimpleName(), work.getStateName());

        work.setHour(12);
        work.writeProgram();
        Assert.assertEquals(NoonState.class.getSimpleName(), work.getStateName());

        work.setHour(13);
        work.writeProgram();
        Assert.assertEquals(AfternoonState.class.getSimpleName(), work.getStateName());
        work.setHour(14);
        work.writeProgram();
        Assert.assertEquals(AfternoonState.class.getSimpleName(), work.getStateName());

        work.setHour(17);
        work.writeProgram();
        Assert.assertEquals(EveningState.class.getSimpleName(), work.getStateName());

        work.setHour(19);
        work.writeProgram();
        Assert.assertEquals(EveningState.class.getSimpleName(), work.getStateName());

        work.setHour(22);
        work.writeProgram();
        Assert.assertEquals(SleepingState.class.getSimpleName(), work.getStateName());

        work.setFinished(true);
        work.writeProgram();
        Assert.assertEquals(RestState.class.getSimpleName(), work.getStateName());
    }

}
