package com.job.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

public class HRCompany extends Company {

    public HRCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {
    }

    @Override
    public void remove(Company company) {
    }

    @Override
    public void display(int depth) {
        Database.getInstance().addDuty(new Duty(this.name, depth));
    }

    @Override
    public void lineOfDuty() {
        Database.getInstance().getDuty(this.name).setDutyName(this.getClass().getSimpleName());
    }
}
