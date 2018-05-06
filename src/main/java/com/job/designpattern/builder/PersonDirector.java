package com.job.designpattern.builder;

public class PersonDirector {
    public void createPerson(PersonBuilder personBuilder) {
        personBuilder.buildHead();
        personBuilder.buildBody();
        personBuilder.buildArmLeft();
        personBuilder.buildArmRight();
        personBuilder.buildLegLeft();
        personBuilder.buildLegRight();
    }
}
