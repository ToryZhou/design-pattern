package com.job.designpattern.observer;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StockObserver extends Observer {

    private boolean watchingStock;
    private String status;

    public StockObserver(String name, Subject subject) {
        super(name, subject);
        this.watchingStock = true;
    }

    @Override
    public void update() {
        this.watchingStock = false;
        this.status = subject.getStatus();
    }
}
