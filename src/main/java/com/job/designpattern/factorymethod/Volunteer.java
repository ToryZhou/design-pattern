package com.job.designpattern.factorymethod;

public class Volunteer extends LeiFeng {
    public Volunteer() {
        setWhichOne(this.getClass().getSimpleName());
    }
}
