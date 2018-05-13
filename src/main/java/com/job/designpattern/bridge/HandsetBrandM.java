package com.job.designpattern.bridge;

public class HandsetBrandM extends HandsetBrand {
    @Override
    public void run() {
        handsetSoft.run();
    }
}
