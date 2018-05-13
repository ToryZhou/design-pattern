package com.job.designpattern.bridge;

import org.junit.Assert;
import org.junit.Test;

public class BridgeTest {

    @Test
    public void test(){
        HandsetBrand handsetBrand;
        handsetBrand = new HandsetBrandM();
        handsetBrand.setHandsetSoft(new HandsetGame());
        handsetBrand.run();

        handsetBrand.setHandsetSoft(new HandsetAddressList());
        handsetBrand.run();

        handsetBrand = new HandsetBrandN();
        handsetBrand.setHandsetSoft(new HandsetGame());
        handsetBrand.run();

        handsetBrand.setHandsetSoft(new HandsetAddressList());
        handsetBrand.run();

        Assert.assertEquals(HandsetGame.class.getSimpleName(),HandsetData.getInstance().getList().get(0));
        Assert.assertEquals(HandsetAddressList.class.getSimpleName(),HandsetData.getInstance().getList().get(1));
        Assert.assertEquals(HandsetGame.class.getSimpleName(),HandsetData.getInstance().getList().get(2));
        Assert.assertEquals(HandsetAddressList.class.getSimpleName(),HandsetData.getInstance().getList().get(3));
    }
}
