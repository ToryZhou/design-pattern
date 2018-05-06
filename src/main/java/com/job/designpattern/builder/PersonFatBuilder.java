package com.job.designpattern.builder;

public class PersonFatBuilder extends PersonBuilder {
    public static final String FAT = "Fat";

    private Person person;

    public PersonFatBuilder() {
        this.person = new Person();
    }

    @Override
    public void buildHead() {
        person.drawHead(FAT);
    }

    @Override
    public void buildBody() {
        person.drawBody(FAT);
    }

    @Override
    public void buildArmLeft() {
        person.drawArmLeft(FAT);
    }

    @Override
    public void buildArmRight() {
        person.drawArmRight(FAT);
    }

    @Override
    public void buildLegLeft() {
        person.drawLegLeft(FAT);
    }

    @Override
    public void buildLegRight() {
        person.drawLegRight(FAT);
    }

    @Override
    public Person getResult() {
        return person;
    }

}
