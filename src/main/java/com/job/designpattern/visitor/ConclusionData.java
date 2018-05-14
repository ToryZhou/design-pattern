package com.job.designpattern.visitor;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class ConclusionData {
    private static ConclusionData conclusionData = new ConclusionData();

    @Getter
    @Setter
    private List<String> list = new ArrayList<>();

    private ConclusionData() {
    }

    public static ConclusionData getInstance() {
        return conclusionData;
    }
}
