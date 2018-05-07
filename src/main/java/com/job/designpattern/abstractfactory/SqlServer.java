package com.job.designpattern.abstractfactory;

import java.util.HashMap;
import java.util.Map;


public class SqlServer {

    private static SqlServer sqlServer = new SqlServer();

    private Map<String, User> userMap;
    private Map<String, Department> departmentMap;

    private SqlServer() {
        this.userMap = new HashMap<>();
        this.departmentMap = new HashMap<>();
    }

    public synchronized static SqlServer getInstance() {
        return sqlServer;
    }

    public Map<String, User> getUserMap() {
        return userMap;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    public Map<String, Department> getDepartmentMap() {
        return departmentMap;
    }

    public void setDepartmentMap(Map<String, Department> departmentMap) {
        this.departmentMap = departmentMap;
    }

    public void addUser(User user) {
        this.userMap.put(user.getId(), user);
    }

    public User getUser(String id) {
        return this.userMap.get(id);
    }

    public void addDepartment(Department department) {
        this.departmentMap.put(department.getId(), department);
    }

    public Department getDepartment(String id) {
        return this.departmentMap.get(id);
    }
}
