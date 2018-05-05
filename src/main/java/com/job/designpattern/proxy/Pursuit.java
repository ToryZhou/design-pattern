package com.job.designpattern.proxy;

public class Pursuit implements GiveGift {

    private SchoolGirl schoolGirl;

    public Pursuit(SchoolGirl schoolGirl) {
        this.schoolGirl = schoolGirl;
    }

    @Override
    public void giveDolls() {
        schoolGirl.setHasDolls(true);
    }

    @Override
    public void giveFlowers() {
        schoolGirl.setHasFlowers(true);
    }

    @Override
    public void giveChocolate() {
        schoolGirl.setHasChocolate(true);
    }
}
