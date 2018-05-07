package com.job.designpattern.abstractfactory;

public interface IFactory {
    IUser createUser();

    IDepartment createDepartment();
}
