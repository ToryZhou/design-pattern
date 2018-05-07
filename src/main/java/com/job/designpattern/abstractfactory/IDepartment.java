package com.job.designpattern.abstractfactory;

public interface IDepartment {
    void insert(Department department);

    Department get(String id);
}
