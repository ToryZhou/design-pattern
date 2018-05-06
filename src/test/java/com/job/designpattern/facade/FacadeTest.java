package com.job.designpattern.facade;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FacadeTest {

    @Test
    public void test() {
        Fund fund = new Fund();
        List<String> assetList = new ArrayList<>();
        fund.buyFund(assetList);
        Assert.assertTrue(assetList.contains(NationalDept.class.getSimpleName()));
        Assert.assertTrue(assetList.contains(Realty.class.getSimpleName()));
        Assert.assertTrue(assetList.contains(Stock.class.getSimpleName()));
        fund.sellFund(assetList);
        Assert.assertTrue(assetList.isEmpty());
    }
}
