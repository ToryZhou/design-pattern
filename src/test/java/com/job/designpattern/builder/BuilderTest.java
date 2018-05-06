package com.job.designpattern.builder;

import org.junit.Assert;
import org.junit.Test;

public class BuilderTest {

    @Test
    public void test() {
        PersonDirector personDirector = new PersonDirector();
        PersonThinBuilder personThinBuilder = new PersonThinBuilder();
        PersonFatBuilder personFatBuilder = new PersonFatBuilder();

        personDirector.createPerson(personThinBuilder);
        Person personThin = personThinBuilder.getResult();

        personDirector.createPerson(personFatBuilder);
        Person peronFat = personFatBuilder.getResult();

        Assert.assertEquals(Person.HEAD + PersonThinBuilder.THIN, personThin.getHead());
        Assert.assertEquals(Person.BODY + PersonFatBuilder.FAT, peronFat.getBody());
    }
}
