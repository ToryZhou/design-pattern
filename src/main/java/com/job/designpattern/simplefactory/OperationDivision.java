package com.job.designpattern.simplefactory;

public class OperationDivision extends Operation {

    @Override
    public double calculate() {
        return super.getNumberA() / super.getNumberB();
    }
}
