package com.job.designpattern.state;

public class EveningState extends State {
    @Override
    public void writeProgram(Work work) {

        if (work.isFinished()) {
            work.setCurrentState(new RestState());
            work.writeProgram();
        } else {
            if (work.getHour() < 21) {
                work.setStateName(this.getClass().getSimpleName());
            } else {
                work.setCurrentState(new SleepingState());
                work.writeProgram();
            }
        }
    }
}
