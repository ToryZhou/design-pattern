package com.job.designpattern.chainofresponsibility;

import java.util.Objects;

public class Majordomo extends Manager {
    public Majordomo(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        if (Request.REQUEST_TYPE_LEAVE.equals(request.getRequestType()) && request.getNumber() <= 5) {
            request.setHandler(this.getClass().getSimpleName());
            request.setStatus(Request.STATUS_YES);
            RequestData.getInstance().getRequestList().add(request);
        } else if (Objects.nonNull(superior)) {
            superior.requestApplications(request);
        }
    }
}
