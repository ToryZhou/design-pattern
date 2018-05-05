package com.job.designpattern.decorator;

import lombok.Getter;

import java.util.List;

public class Person {

    @Getter
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("装扮的 " + name);
    }

    public List<String> putOn(List<String> fineryList) {
        fineryList.add(Person.class.getSimpleName());
        return fineryList;
    }


}
