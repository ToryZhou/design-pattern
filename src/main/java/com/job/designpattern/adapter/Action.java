package com.job.designpattern.adapter;

import lombok.Data;

import java.util.UUID;

@Data
public class Action {
    private String id;
    private String name;
    private String clazz;
    private String method;


    public Action(String name, String clazz, String method) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.clazz = clazz;
        this.method = method;
    }
}
