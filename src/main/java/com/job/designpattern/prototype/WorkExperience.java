package com.job.designpattern.prototype;

import lombok.Data;

@Data
public class WorkExperience implements Cloneable {
    private String timeArea;
    private String company;

    public WorkExperience clone() throws CloneNotSupportedException {
        return (WorkExperience) super.clone();
    }
}
