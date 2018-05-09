package com.job.designpattern.adapter;

public class Guards extends Player {

    public Guards(String name) {
        super(name);
    }

    @Override
    public Action attack() {
        return new Action(super.name, Thread.currentThread().getStackTrace()[1].getClassName(), Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @Override
    public Action defense() {
        return new Action(super.name, Thread.currentThread().getStackTrace()[1].getClassName(), Thread.currentThread().getStackTrace()[1].getMethodName());
    }

}
