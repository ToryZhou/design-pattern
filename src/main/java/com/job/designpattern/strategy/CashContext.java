package com.job.designpattern.strategy;

public class CashContext {
    private CashSuper cashSuper;

    public CashContext(CashSuper cashSuper) {
        this.cashSuper = cashSuper;
    }

    public double getResult(double money) {
        return cashSuper.acceptCash(money);
    }
}
