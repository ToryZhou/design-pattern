package com.job.designpattern.composite;

import org.junit.Assert;
import org.junit.Test;

public class CompositeTest {

    @Test
    public void test() {
        ConcreteCompany worldCompany = new ConcreteCompany("World Company");
        worldCompany.add(new HRCompany("World Company HR"));
        worldCompany.add(new FinanceCompany("World Company Finance"));

        ConcreteCompany asiaCompany = new ConcreteCompany("Asia Company");
        asiaCompany.add(new HRCompany("Asia Company HR"));
        asiaCompany.add(new FinanceCompany("Asia Company Finance"));
        worldCompany.add(asiaCompany);

        ConcreteCompany chinaCompany = new ConcreteCompany("China Company");
        chinaCompany.add(new HRCompany("China Company HR"));
        chinaCompany.add(new FinanceCompany("China Company Finance"));
        asiaCompany.add(chinaCompany);


        worldCompany.display(1);
        worldCompany.lineOfDuty();

        Assert.assertEquals(3, Database.getInstance().getDuty("World Company HR").getDepth());
        Assert.assertEquals(HRCompany.class.getSimpleName(), Database.getInstance().getDuty("World Company HR").getDutyName());

        Assert.assertEquals(7, Database.getInstance().getDuty("China Company Finance").getDepth());
        Assert.assertEquals(FinanceCompany.class.getSimpleName(), Database.getInstance().getDuty("China Company Finance").getDutyName());
    }
}
