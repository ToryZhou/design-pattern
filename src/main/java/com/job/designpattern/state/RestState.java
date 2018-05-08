package com.job.designpattern.state;

public class RestState extends State {
    @Override
    public void writeProgram(Work work) {
        work.setStateName(this.getClass().getSimpleName());
    }
}
