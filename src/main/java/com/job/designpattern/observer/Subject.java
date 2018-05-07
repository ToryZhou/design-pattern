package com.job.designpattern.observer;

public interface Subject {
    void attach(Observer observer);

    void detach(Observer observer);

    void inform();

    String getStatus();

    void setStatus(String status);

}
