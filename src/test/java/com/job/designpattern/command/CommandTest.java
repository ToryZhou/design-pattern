package com.job.designpattern.command;

import org.junit.Assert;
import org.junit.Test;

public class CommandTest {

    @Test
    public void test() {
        Barbecuer barbecuer = new Barbecuer();
        BakeMuttonCommand bakeMuttonCommand1 = new BakeMuttonCommand(barbecuer);
        BakeMuttonCommand bakeMuttonCommand2 = new BakeMuttonCommand(barbecuer);
        BakeChickenWingCommand bakeChickenWingCommand = new BakeChickenWingCommand(barbecuer);

        Waiter waiter = new Waiter();
        waiter.setOrder(bakeMuttonCommand1);
        waiter.setOrder(bakeMuttonCommand2);
        waiter.setOrder(bakeChickenWingCommand);
        waiter.cancelOrder(bakeMuttonCommand2);

        waiter.inform();

        Assert.assertEquals(1, CommandData.getInstance().getBakeList().size());
        Assert.assertEquals("bakeMutton", CommandData.getInstance().getBakeList().get(0));

        Assert.assertEquals(4, CommandData.getInstance().getLogList().size());
        Assert.assertEquals("setOrder" + BakeMuttonCommand.class.getSimpleName(), CommandData.getInstance().getLogList().get(0));
        Assert.assertEquals("setOrder" + BakeMuttonCommand.class.getSimpleName(), CommandData.getInstance().getLogList().get(1));
        Assert.assertEquals("No chicken wing", CommandData.getInstance().getLogList().get(2));
        Assert.assertEquals("cancelOrder" + BakeMuttonCommand.class.getSimpleName(), CommandData.getInstance().getLogList().get(3));
    }
}
