package com.job.designpattern.command;

public class Barbecuer {

    public void bakeMutton(){
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        CommandData.getInstance().getBakeList().add(methodName);
    }

    public void bakeChickenWing(){
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        CommandData.getInstance().getBakeList().add(methodName);
    }
}
