package com.job.designpattern.singleton;

import org.junit.Assert;
import org.junit.Test;

public class SingletonTest {

    @Test
    public void test() {
        Lazy.getInstance().setName("A");
        Assert.assertEquals("A", Lazy.getInstance().getName());

        Hungry.getInstance().setName("B");
        Assert.assertEquals("B", Hungry.getInstance().getName());

    }
}
