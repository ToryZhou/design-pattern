package com.job.designpattern.simplefactory;

public class OperationAddition extends Operation {

    @Override
    public double calculate() {
        return super.getNumberA() + super.getNumberB();
    }
}
