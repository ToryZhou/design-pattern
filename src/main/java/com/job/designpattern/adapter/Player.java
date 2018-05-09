package com.job.designpattern.adapter;

public abstract class Player {
    protected String name;

    public Player(String name) {
        this.name = name;
    }

    public abstract Action attack();

    public abstract Action defense();

}
