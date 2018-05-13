package com.job.designpattern.composite;

import lombok.Data;

@Data
public class Duty {
    private String companyName;
    private int depth;
    private String dutyName;

    public Duty(String companyName, int depth) {
        this.companyName = companyName;
        this.depth = depth;
    }
}
