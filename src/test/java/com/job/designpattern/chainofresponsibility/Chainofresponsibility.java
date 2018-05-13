package com.job.designpattern.chainofresponsibility;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class Chainofresponsibility {

    @Test
    public void test(){

        CommonManager musk = new CommonManager("Musk");
        Majordomo zuckerberg = new Majordomo("Zuckerberg");
        GeneralManager bill = new GeneralManager("Bill");
        musk.setSuperior(zuckerberg);
        zuckerberg.setSuperior(bill);

        Request requestLeaveOneDay = new Request();
        requestLeaveOneDay.setRequestType(Request.REQUEST_TYPE_LEAVE);
        requestLeaveOneDay.setNumber(1);
        musk.requestApplications(requestLeaveOneDay);

        Request requestLeaveFourDay = new Request();
        requestLeaveFourDay.setRequestType(Request.REQUEST_TYPE_LEAVE);
        requestLeaveFourDay.setNumber(4);
        musk.requestApplications(requestLeaveFourDay);

        Request requestRaiseHundred = new Request();
        requestRaiseHundred.setRequestType(Request.REQUEST_TYPE_RAISE);
        requestRaiseHundred.setNumber(100);
        musk.requestApplications(requestRaiseHundred);

        Request requestRaiseThousand = new Request();
        requestRaiseThousand.setRequestType(Request.REQUEST_TYPE_RAISE);
        requestRaiseThousand.setNumber(1000);
        musk.requestApplications(requestRaiseThousand);

        List<Request> requestList = RequestData.getInstance().getRequestList();
        Assert.assertEquals(4, requestList.size());
        Assert.assertEquals(CommonManager.class.getSimpleName(), requestList.get(0).getHandler());
        Assert.assertEquals(Request.STATUS_YES, requestList.get(0).getStatus());

        Assert.assertEquals(Majordomo.class.getSimpleName(), requestList.get(1).getHandler());
        Assert.assertEquals(Request.STATUS_YES, requestList.get(1).getStatus());

        Assert.assertEquals(GeneralManager.class.getSimpleName(), requestList.get(2).getHandler());
        Assert.assertEquals(Request.STATUS_YES, requestList.get(2).getStatus());

        Assert.assertEquals(GeneralManager.class.getSimpleName(), requestList.get(3).getHandler());
        Assert.assertEquals(Request.STATUS_NO, requestList.get(3).getStatus());





    }
}
