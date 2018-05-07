package com.job.designpattern.abstractfactory;

public class AccessDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        Access.getInstance().addDepartment(department);
    }

    @Override
    public Department get(String id) {
        return Access.getInstance().getDepartment(id);
    }
}
