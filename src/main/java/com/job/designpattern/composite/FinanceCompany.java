package com.job.designpattern.composite;

public class FinanceCompany extends Company {

    public FinanceCompany(String name) {
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
