package com.job.designpattern.proxy;

import org.junit.Assert;
import org.junit.Test;

public class ProxyTest {

    @Test
    public void test(){
        SchoolGirl schoolGirl = new SchoolGirl();
        Assert.assertFalse(schoolGirl.isHasDolls());
        Assert.assertFalse(schoolGirl.isHasFlowers());
        Assert.assertFalse(schoolGirl.isHasChocolate());
        Proxy proxy = new Proxy(schoolGirl);
        proxy.giveDolls();
        proxy.giveFlowers();
        proxy.giveChocolate();
        Assert.assertTrue(schoolGirl.isHasDolls());
        Assert.assertTrue(schoolGirl.isHasFlowers());
        Assert.assertTrue(schoolGirl.isHasChocolate());
    }
}
