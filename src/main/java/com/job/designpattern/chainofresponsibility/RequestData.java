package com.job.designpattern.chainofresponsibility;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class RequestData {

    private static RequestData requestData = new RequestData();

    @Getter
    @Setter
    private List<Request> requestList = new ArrayList<>();

    private RequestData() {
    }

    public static RequestData getInstance() {
        return requestData;
    }
}
