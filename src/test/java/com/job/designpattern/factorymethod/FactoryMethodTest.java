package com.job.designpattern.factorymethod;

import org.junit.Assert;
import org.junit.Test;

public class FactoryMethodTest {

    @Test
    public void test() {
        UndergraduateFactory undergraduateFactory = new UndergraduateFactory();
        LeiFeng juniorStudent = undergraduateFactory.createLeiFeng();
        juniorStudent.wash();
        Assert.assertEquals(Undergraduate.class.getSimpleName(), juniorStudent.getWhichOne());
        Assert.assertTrue(juniorStudent.isDoWash());

        LeiFeng seniorStudent = undergraduateFactory.createLeiFeng();
        seniorStudent.buyRice();
        Assert.assertTrue(seniorStudent.isDoBuyRice());
        Assert.assertFalse(seniorStudent.isDoWash());

        VolunteerFactory volunteerFactory = new VolunteerFactory();
        LeiFeng volunteer = volunteerFactory.createLeiFeng();
        volunteer.sweep();
        Assert.assertEquals(Volunteer.class.getSimpleName(), volunteer.getWhichOne());
        Assert.assertTrue(volunteer.isDoSweep());

    }
}
