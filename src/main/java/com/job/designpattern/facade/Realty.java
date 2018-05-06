package com.job.designpattern.facade;

import java.util.List;

public class Realty {

    public void buy(List<String> assetList) {
        assetList.add(this.getClass().getSimpleName());
    }

    public void sell(List<String> assetList) {
        assetList.remove(this.getClass().getSimpleName());
    }
}
