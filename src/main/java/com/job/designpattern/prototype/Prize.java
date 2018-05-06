package com.job.designpattern.prototype;

import lombok.Data;

@Data
public class Prize implements Cloneable {
    private String name;

    public Prize(String name) {
        this.name = name;
    }

    @Override
    public Prize clone() throws CloneNotSupportedException {
        return (Prize) super.clone();
    }
}
