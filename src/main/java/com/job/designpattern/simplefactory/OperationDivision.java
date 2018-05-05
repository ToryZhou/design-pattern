package com.job.designpattern.simplefactory;

public class OperationDivision extends Operation {

    @Override
    public double calc() {
        return super.getNumberA() / super.getNumberB();
    }
}
