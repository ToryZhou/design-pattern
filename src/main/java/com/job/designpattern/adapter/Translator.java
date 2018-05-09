package com.job.designpattern.adapter;

public class Translator extends Player {

    private ForeignCenter foreignCenter;

    public Translator(String name) {
        super(name);
        this.foreignCenter = new ForeignCenter(name);
    }

    @Override
    public Action attack() {
        return foreignCenter.attackForeign();
    }

    @Override
    public Action defense() {
        return foreignCenter.defenseForeign();
    }

}
