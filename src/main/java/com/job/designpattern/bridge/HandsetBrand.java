package com.job.designpattern.bridge;

public abstract class HandsetBrand {
    protected HandsetSoft handsetSoft;

    public void setHandsetSoft(HandsetSoft handsetSoft) {
        this.handsetSoft = handsetSoft;
    }

    public abstract void run();

}
