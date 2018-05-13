package com.job.designpattern.flyweight;

import lombok.Getter;
import lombok.Setter;

public class ConcreteWebsite extends Website {

    @Getter
    @Setter
    private String name;

    public ConcreteWebsite(String name) {
        this.name = name;
    }

    @Override
    public void use(User user) {
        UseData.getInstance().getList().add(user.getName() + " " + Thread.currentThread().getStackTrace()[1].getMethodName() + " " + this.name);
    }
}
