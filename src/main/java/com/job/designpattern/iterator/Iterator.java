package com.job.designpattern.iterator;

public abstract class Iterator {

    public abstract Object first();
    public abstract Object next();
    public abstract boolean isDone();
    public abstract Object currentItem();
    public abstract int current();

}
