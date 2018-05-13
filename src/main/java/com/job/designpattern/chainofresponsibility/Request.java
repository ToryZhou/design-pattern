package com.job.designpattern.chainofresponsibility;

import lombok.Data;

@Data
public class Request {
    private String requestType;
    private String requestContent;
    private int number;

    private String handler;

    private String status;

    public static String REQUEST_TYPE_LEAVE = "leave";
    public static String REQUEST_TYPE_RAISE = "raise";

    public static String STATUS_YES = "yes";
    public static String STATUS_NO = "no";
}
