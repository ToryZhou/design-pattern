package com.job.designpattern.simplefactory;

public class OperationSubtraction extends Operation {
    @Override
    public double calculate() {
        return super.getNumberA() - super.getNumberB();
    }
}
