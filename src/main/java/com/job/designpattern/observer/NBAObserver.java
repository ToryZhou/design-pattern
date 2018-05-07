package com.job.designpattern.observer;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class NBAObserver extends Observer {
    private boolean watchingNBA;

    private String status;

    public NBAObserver(String name, Subject subject) {
        super(name, subject);
        this.watchingNBA = true;
    }

    @Override
    public void update() {
        this.watchingNBA = false;
        this.status = subject.getStatus();
    }
}
