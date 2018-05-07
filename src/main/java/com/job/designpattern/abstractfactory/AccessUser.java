package com.job.designpattern.abstractfactory;

public class AccessUser implements IUser {
    @Override
    public void insert(User user) {
        Access.getInstance().addUser(user);
    }

    @Override
    public User get(String id) {
        return Access.getInstance().getUser(id);
    }
}
