package com.job.designpattern.observer;

import org.junit.Assert;
import org.junit.Test;

public class ObserverTest {

    @Test
    public void test(){
        Boss boss = new Boss();
        StockObserver bill = new StockObserver("Bill", boss);
        StockObserver musk = new StockObserver("Musk", boss);
        NBAObserver kobe = new NBAObserver("Kobe", boss);
        Assert.assertTrue(bill.isWatchingStock());

        boss.attach(bill);
        boss.attach(musk);
        boss.attach(kobe);
        boss.detach(musk);
        boss.setStatus("Coming back");
        boss.inform();

        Assert.assertFalse(bill.isWatchingStock());
        Assert.assertTrue(musk.isWatchingStock());
        Assert.assertFalse(kobe.isWatchingNBA());
        Assert.assertEquals("Coming back",bill.getStatus());
    }
}
