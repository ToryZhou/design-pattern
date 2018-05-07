package com.job.designpattern.abstractfactory;

import lombok.Data;

@Data
public class Department {
    private String id;
    private String name;

    public Department(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
