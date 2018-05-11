package com.job.designpattern.iterator;

public class ConcreteIteratorDesc extends Iterator {
    private ConcreteAggregate concreteAggregate;

    private int current;

    public ConcreteIteratorDesc(ConcreteAggregate concreteAggregate) {
        this.concreteAggregate = concreteAggregate;
        this.current = concreteAggregate.count()-1;
    }

    @Override
    public Object first() {
        return concreteAggregate.get(current);
    }

    @Override
    public Object next() {
        Object result = null;
        current--;
        if (current >= 0) {
            result = concreteAggregate.get(current);
        }
        return result;
    }

    @Override
    public boolean isDone() {
        return current < 0;
    }

    @Override
    public Object currentItem() {
        return concreteAggregate.get(current);
    }

    @Override
    public int current() {
        return current;
    }
}
