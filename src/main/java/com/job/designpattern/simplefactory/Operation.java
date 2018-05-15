package com.job.designpattern.simplefactory;

import lombok.Data;

@Data
public abstract class Operation {

    private double numberA;
    private double numberB;

    public double calculate() {
        return 0.0;
    }

}
