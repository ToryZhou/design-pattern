package com.job.designpattern.singleton;

import lombok.Getter;
import lombok.Setter;

public class Hungry {
    private static Hungry hungry =new Hungry();

    @Getter
    @Setter
    private String name;

    private Hungry() {
    }

    public static Hungry getInstance(){
        return hungry;
    }
}
