package com.job.designpattern.bridge;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class HandsetData {
    private static HandsetData handsetData = new HandsetData();

    @Getter
    @Setter
    private List<String> list =new ArrayList<>();

    private HandsetData() {
    }

    public static HandsetData getInstance(){
        return handsetData;
    }
}
