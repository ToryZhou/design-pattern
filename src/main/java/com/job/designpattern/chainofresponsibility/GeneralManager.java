package com.job.designpattern.chainofresponsibility;

public class GeneralManager extends Manager {
    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        request.setHandler(this.getClass().getSimpleName());
        if (Request.REQUEST_TYPE_LEAVE.equals(request.getRequestType())) {
            request.setStatus(Request.STATUS_YES);
        } else if (Request.REQUEST_TYPE_RAISE.equals(request.getRequestType()) && request.getNumber() <= 500) {
            request.setStatus(Request.STATUS_YES);
        } else if (request.getNumber() > 500) {
            request.setStatus(Request.STATUS_NO);
        }
        RequestData.getInstance().getRequestList().add(request);
    }
}
