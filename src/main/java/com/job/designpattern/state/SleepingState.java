package com.job.designpattern.state;

public class SleepingState extends State {
    @Override
    public void writeProgram(Work work) {
        if (work.isFinished()) {
            work.setCurrentState(new RestState());
            work.writeProgram();
        }else{
            work.setStateName(this.getClass().getSimpleName());
        }

    }
}
