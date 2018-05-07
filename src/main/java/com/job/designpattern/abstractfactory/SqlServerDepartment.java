package com.job.designpattern.abstractfactory;

public class SqlServerDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        SqlServer.getInstance().addDepartment(department);
    }

    @Override
    public Department get(String id) {
        return SqlServer.getInstance().getDepartment(id);
    }
}
