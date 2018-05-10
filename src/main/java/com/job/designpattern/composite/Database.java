package com.job.designpattern.composite;

import java.util.HashMap;
import java.util.Map;

public class Database {

    private static Database database = new Database();

    private Map<String, Duty> dutyMap;

    private Database() {
        this.dutyMap = new HashMap<>();
    }

    public synchronized static Database getInstance() {
        return database;
    }

    public void addDuty(Duty duty) {
        this.dutyMap.put(duty.getCompanyName(), duty);
    }

    public Duty getDuty(String companyName) {
        return this.dutyMap.get(companyName);
    }
}
