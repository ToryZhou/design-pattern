package com.job.designpattern.singleton;

import lombok.Getter;
import lombok.Setter;

public class Lazy {

    private static Lazy lazy;

    @Getter
    @Setter
    private String name;

    private Lazy() {
    }
    public static Lazy getInstance() {
        if (null == lazy) {
            synchronized (Lazy.class) {
                if (lazy == null) {
                    lazy = new Lazy();
                }
            }
        }
        return lazy;
    }
}
