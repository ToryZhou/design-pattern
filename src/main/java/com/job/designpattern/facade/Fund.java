package com.job.designpattern.facade;

import java.util.List;

public class Fund {

    private NationalDept nationalDept;
    private Realty realty;
    private Stock stock;

    public Fund() {
        this.nationalDept = new NationalDept();
        this.realty = new Realty();
        this.stock = new Stock();
    }

    public void buyFund(List<String> assetList) {
        nationalDept.buy(assetList);
        realty.buy(assetList);
        stock.buy(assetList);
    }

    public void sellFund(List<String> assetList) {
        nationalDept.sell(assetList);
        realty.sell(assetList);
        stock.sell(assetList);
    }
}
