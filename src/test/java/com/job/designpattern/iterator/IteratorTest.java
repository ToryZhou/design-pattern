package com.job.designpattern.iterator;

import org.junit.Assert;
import org.junit.Test;

public class IteratorTest {

    @Test
    public void test() {
        ConcreteAggregate concreteAggregate = new ConcreteAggregate();
        concreteAggregate.add("A");
        concreteAggregate.add("B");
        concreteAggregate.add("C");

        Iterator concreteIterator = new ConcreteIterator(concreteAggregate);
        Assert.assertEquals("A", concreteIterator.first());
        Object[] objects = new Object[3];
        while (!concreteIterator.isDone()) {
            objects[concreteIterator.current()] = concreteIterator.currentItem();
            concreteIterator.next();
        }
        Assert.assertArrayEquals(new Object[]{"A", "B", "C"}, objects);
    }
}
