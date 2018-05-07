package com.job.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Boss implements Subject {
    private List<Observer> observerList = new ArrayList<>();

    private String status;

    @Override
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void inform() {
        //当所需要通知的对象方法不一致时，得使用事件委托，可以用放射来获取委托的参数和方法
        observerList.forEach(Observer::update);
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void setStatus(String status) {
        this.status = status;
    }
}
