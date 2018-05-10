package com.job.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

public class ConcreteCompany extends Company {
    private List<Company> companyList;

    public ConcreteCompany(String name) {
        super(name);
        this.companyList = new ArrayList<>();
    }

    @Override
    public void add(Company company) {
        companyList.add(company);
    }

    @Override
    public void remove(Company company) {
        companyList.remove(company);
    }

    @Override
    public void display(int depth) {
        Database.getInstance().addDuty(new Duty(this.name, depth));
        companyList.forEach(item -> item.display(depth + 2));
    }

    @Override
    public void lineOfDuty() {
        companyList.forEach(Company::lineOfDuty);
    }
}
