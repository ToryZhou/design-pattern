package com.job.designpattern.factorymethod;

import lombok.Data;

@Data
public class LeiFeng {

    private boolean doSweep;
    private boolean doWash;
    private boolean doBuyRice;
    private String whichOne;

    public void sweep() {
        this.doSweep = true;
    }

    public void wash() {
        this.doWash = true;
    }

    public void buyRice() {
        this.doBuyRice = true;
    }
}
