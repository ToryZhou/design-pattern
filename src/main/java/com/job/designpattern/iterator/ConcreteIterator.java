package com.job.designpattern.iterator;

public class ConcreteIterator extends Iterator {
    private ConcreteAggregate concreteAggregate;

    private int current = 0;

    public ConcreteIterator(ConcreteAggregate concreteAggregate) {
        this.concreteAggregate = concreteAggregate;
    }

    @Override
    public Object first() {
        return concreteAggregate.get(0);
    }

    @Override
    public Object next() {
        Object result = null;
        current++;
        if (current < concreteAggregate.count()) {
            result = concreteAggregate.get(current);
        }
        return result;
    }

    @Override
    public boolean isDone() {
        return current >= concreteAggregate.count();
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
