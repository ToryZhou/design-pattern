package com.job.designpattern.strategy;

import org.junit.Assert;
import org.junit.Test;

public class StrategyTest {

    @Test
    public void test() {
        testNormal();
        testRebate();
        testReturn();
    }

    private void testNormal() {
        CashNormal cashNormal = new CashNormal();
        CashContext cashContext = new CashContext(cashNormal);
        Assert.assertEquals(100, cashContext.getResult(100), 0);
    }

    private void testRebate() {
        CashRebate cashRebate = new CashRebate(0.8);
        CashContext cashContext = new CashContext(cashRebate);
        Assert.assertEquals(80, cashContext.getResult(100), 0);
    }

    private void testReturn() {
        CashReturn cashReturn = new CashReturn(300, 100);
        CashContext cashContext = new CashContext(cashReturn);
        Assert.assertEquals(500, cashContext.getResult(700), 0);
        Assert.assertEquals(50, cashContext.getResult(50), 0);
    }
}
