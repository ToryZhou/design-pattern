package com.job.designpattern.state;

public class AfternoonState extends State {
    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 17) {
            work.setStateName(this.getClass().getSimpleName());
        } else {
            work.setCurrentState(new EveningState());
            work.writeProgram();
        }
    }
}
