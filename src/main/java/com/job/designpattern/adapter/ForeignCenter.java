package com.job.designpattern.adapter;

public class ForeignCenter {

    private String name;

    public ForeignCenter(String name) {
        this.name = name;
    }

    public Action attackForeign() {
        return new Action(this.name, Thread.currentThread().getStackTrace()[1].getClassName(), Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    public Action defenseForeign() {
        return new Action(this.name, Thread.currentThread().getStackTrace()[1].getClassName(), Thread.currentThread().getStackTrace()[1].getMethodName());
    }

}
