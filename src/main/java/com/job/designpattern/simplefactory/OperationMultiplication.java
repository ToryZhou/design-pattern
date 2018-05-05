package com.job.designpattern.simplefactory;

public class OperationMultiplication  extends Operation{

    @Override
    public double calc() {
        return super.getNumberA() * super.getNumberB();
    }
}
