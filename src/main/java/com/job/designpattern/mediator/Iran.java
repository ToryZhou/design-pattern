package com.job.designpattern.mediator;

public class Iran extends Country {
    public Iran(UnitedNations unitedNations) {
        super(unitedNations);
    }

    @Override
    public void declare(String message) {
        unitedNations.declare(message, this);
    }

    @Override
    public void getMessage(String message) {
        MessageData.getInstance().getList().add(this.getClass().getSimpleName() + Thread.currentThread().getStackTrace()[1].getMethodName() + message);
    }
}
