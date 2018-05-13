package com.job.designpattern.command;

public class BakeChichenWingCommand extends Command {
    public BakeChichenWingCommand(Barbecuer barbecuer) {
        super(barbecuer);
    }

    @Override
    public void executeCommand() {
        barbecuer.bakeChickenWing();
    }
}
