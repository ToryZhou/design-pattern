package com.job.designpattern.decorator;

import java.util.List;

public class Finery extends Person {

    protected Person component;

    public void decorate(Person component) {
        this.component = component;
    }

    @Override
    public void show() {
        component.show();
    }

    @Override
    public List<String> putOn(List<String> fineryList) {
        return component.putOn(fineryList);
    }
}
