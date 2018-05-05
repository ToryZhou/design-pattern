package com.job.designpattern.decorator;

import java.util.List;

public class Sneakers extends Finery {

    @Override
    public void show() {
        System.out.println(this.getClass().getSimpleName());
        super.show();
    }

    @Override
    public List<String> putOn(List<String> fineryList) {
        fineryList.add(this.getClass().getSimpleName());
        return super.putOn(fineryList);
    }
}
