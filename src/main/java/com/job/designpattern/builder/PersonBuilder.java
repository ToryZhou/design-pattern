package com.job.designpattern.builder;

public abstract class PersonBuilder {
    public abstract void buildHead();

    public abstract void buildBody();

    public abstract void buildArmLeft();

    public abstract void buildArmRight();

    public abstract void buildLegLeft();

    public abstract void buildLegRight();

    public abstract Person getResult();
}
