package com.job.designpattern.visitor;

public class Woman extends Person {
    @Override
    public void accept(Action action) {
        action.getWomanConclusion(this);
    }
}
