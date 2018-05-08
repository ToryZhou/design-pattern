package com.job.designpattern.state;

import lombok.Data;

@Data
public class Work {
    private int hour;
    private boolean finished = false;
    private State currentState;

    private String stateName;

    public Work() {
        currentState = new ForenoonState();
    }

    public void writeProgram() {
        currentState.writeProgram(this);
    }
}
