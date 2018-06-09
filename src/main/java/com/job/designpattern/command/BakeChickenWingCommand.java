package com.job.designpattern.command;

public class BakeChickenWingCommand extends Command {
    public BakeChickenWingCommand(Barbecuer barbecuer) {
        super(barbecuer);
    }

    @Override
    public void executeCommand() {
        barbecuer.bakeChickenWing();
    }
}
