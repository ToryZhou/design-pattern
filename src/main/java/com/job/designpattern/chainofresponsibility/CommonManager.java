package com.job.designpattern.chainofresponsibility;

import java.util.Objects;

public class CommonManager extends Manager {
    public CommonManager(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        if (Request.REQUEST_TYPE_LEAVE.equals(request.getRequestType()) && request.getNumber() <= 2) {
            request.setHandler(this.getClass().getSimpleName());
            request.setStatus(Request.STATUS_YES);
            RequestData.getInstance().getRequestList().add(request);
        } else if (Objects.nonNull(superior)) {
            superior.requestApplications(request);
        }
    }
}
