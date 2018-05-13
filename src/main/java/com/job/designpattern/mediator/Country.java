package com.job.designpattern.mediator;

public abstract class Country {
    protected UnitedNations unitedNations;

    public Country(UnitedNations unitedNations) {
        this.unitedNations = unitedNations;
    }

    public abstract void declare(String message);

    public abstract void getMessage(String message);

}
