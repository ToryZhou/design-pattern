package com.job.designpattern.state;

public class NoonState extends State {
    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 13) {
            work.setStateName(this.getClass().getSimpleName());
        } else {
            work.setCurrentState(new AfternoonState());
            work.writeProgram();
        }
    }
}
