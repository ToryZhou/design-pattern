package com.job.designpattern.visitor;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {

    private List<Person> personList = new ArrayList<>();

    public void attach(Person person) {
        personList.add(person);
    }

    public void detach(Person person) {
        personList.remove(person);
    }

    public void display(Action action) {
        personList.forEach(item -> item.accept(action));
    }
}
