package com.job.designpattern.builder;

public class PersonThinBuilder extends PersonBuilder {
    public static final String THIN = "Thin";

    private Person person;

    public PersonThinBuilder() {
        this.person = new Person();
    }

    @Override
    public void buildHead() {
        person.drawHead(THIN);
    }

    @Override
    public void buildBody() {
        person.drawBody(THIN);
    }

    @Override
    public void buildArmLeft() {
        person.drawArmLeft(THIN);
    }

    @Override
    public void buildArmRight() {
        person.drawArmRight(THIN);
    }

    @Override
    public void buildLegLeft() {
        person.drawLegLeft(THIN);
    }

    @Override
    public void buildLegRight() {
        person.drawLegRight(THIN);
    }

    @Override
    public Person getResult() {
        return person;
    }
}
