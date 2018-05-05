package com.job.designpattern.simplefactory;

public class OperationAddition extends Operation {

    @Override
    public double calc() {
        return super.getNumberA() + super.getNumberB();
    }
}
