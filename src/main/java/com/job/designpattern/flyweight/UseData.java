package com.job.designpattern.flyweight;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class UseData {

    private static UseData useData = new UseData();

    @Getter
    @Setter
    private List<String> list = new ArrayList<>();

    private UseData() {
    }

    public static UseData getInstance(){
        return useData;
    }
}
