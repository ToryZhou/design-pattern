package com.job.designpattern.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate extends Aggregate {

    private List<Object> list = new ArrayList<>();

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public int count() {
        return list.size();
    }

    public Object get(int index) {
        return list.get(index);
    }

    public void add(Object object) {
        list.add(object);
    }

    public void set(int index, Object object) {
        list.set(index, object);
    }
}
