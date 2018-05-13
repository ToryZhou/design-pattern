package com.job.designpattern.command;

public abstract class Command {

    protected Barbecuer barbecuer;

    public Command(Barbecuer barbecuer) {
        this.barbecuer = barbecuer;
    }

    public abstract void executeCommand();
}
