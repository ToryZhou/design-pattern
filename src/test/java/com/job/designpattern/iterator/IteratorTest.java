package com.job.designpattern.iterator;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

        Iterator concreteIteratorDesc = new ConcreteIteratorDesc(concreteAggregate);
        Assert.assertEquals("C", concreteIteratorDesc.first());
        List<Object> list = new ArrayList<>();
        while (!concreteIteratorDesc.isDone()) {
            list.add(concreteIteratorDesc.currentItem());
            concreteIteratorDesc.next();
        }
        Assert.assertArrayEquals(new Object[]{"C", "B", "A"}, list.toArray());
    }
}
