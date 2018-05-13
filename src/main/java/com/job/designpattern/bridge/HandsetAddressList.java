package com.job.designpattern.bridge;

public class HandsetAddressList extends HandsetSoft {
    @Override
    public void run() {
        HandsetData.getInstance().getList().add(this.getClass().getSimpleName());
    }
}
