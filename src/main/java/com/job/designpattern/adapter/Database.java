package com.job.designpattern.adapter;

import java.util.HashMap;
import java.util.Map;

@Deprecated
public class Database {

    private static Database database = new Database();

    private Map<String, Action> actionMap;

    private Database() {
        this.actionMap = new HashMap<>();
    }

    public synchronized static Database getInstance() {
        return database;
    }

    public void addAction(Action action) {
        this.actionMap.put(action.getId(), action);
    }

    public Action getAction(String id) {
        return this.actionMap.get(id);
    }
}
