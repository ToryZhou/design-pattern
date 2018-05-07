package com.job.designpattern.abstractfactory;

public class SqlServerUser implements IUser {
    @Override
    public void insert(User user) {
        SqlServer.getInstance().addUser(user);
    }

    @Override
    public User get(String id) {
        return SqlServer.getInstance().getUser(id);
    }
}
