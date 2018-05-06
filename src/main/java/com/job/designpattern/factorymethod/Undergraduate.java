package com.job.designpattern.factorymethod;

public class Undergraduate extends LeiFeng {

    public Undergraduate() {
        setWhichOne(this.getClass().getSimpleName());
    }
}
