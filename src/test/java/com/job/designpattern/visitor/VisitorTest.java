package com.job.designpattern.visitor;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class VisitorTest {

    @Test
    public void test() {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());

        Success success = new Success();
        objectStructure.display(success);

        Failing failing = new Failing();
        objectStructure.display(failing);

        Amativeness amativeness = new Amativeness();
        objectStructure.display(amativeness);

        Marriage marriage = new Marriage();
        objectStructure.display(marriage);

        List<String> list = ConclusionData.getInstance().getList();
        Assert.assertEquals(8, list.size());
        Assert.assertEquals(Man.class.getSimpleName() + success.getClass().getSimpleName(), list.get(0));
        Assert.assertEquals(Woman.class.getSimpleName() + success.getClass().getSimpleName(), list.get(1));
        Assert.assertEquals(Man.class.getSimpleName() + failing.getClass().getSimpleName(), list.get(2));
        Assert.assertEquals(Woman.class.getSimpleName() + failing.getClass().getSimpleName(), list.get(3));
        Assert.assertEquals(Man.class.getSimpleName() + amativeness.getClass().getSimpleName(), list.get(4));
        Assert.assertEquals(Woman.class.getSimpleName() + amativeness.getClass().getSimpleName(), list.get(5));
        Assert.assertEquals(Man.class.getSimpleName() + marriage.getClass().getSimpleName(), list.get(6));
        Assert.assertEquals(Woman.class.getSimpleName() + marriage.getClass().getSimpleName(), list.get(7));
    }
}
