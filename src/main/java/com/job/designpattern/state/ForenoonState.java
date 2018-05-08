package com.job.designpattern.state;

public class ForenoonState extends State {
    @Override
    public void writeProgram(Work work) {
        if(work.getHour()<12){
            work.setStateName(this.getClass().getSimpleName());
        }else {
            work.setCurrentState(new NoonState());
            work.writeProgram();
        }
    }
}
