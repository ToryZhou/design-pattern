package com.job.designpattern.memento;

import org.junit.Assert;
import org.junit.Test;

public class MementoTest {

    @Test
    public void test(){
        GameRole gameRole = new GameRole();
        gameRole.initState();
        Assert.assertEquals(100,gameRole.getVitality());
        Assert.assertEquals(100,gameRole.getAttack());
        Assert.assertEquals(100,gameRole.getDefense());

        RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
        roleStateCaretaker.setRoleStateMemento(gameRole.saveState());

        gameRole.fight();
        Assert.assertEquals(0,gameRole.getVitality());
        Assert.assertEquals(0,gameRole.getAttack());
        Assert.assertEquals(0,gameRole.getDefense());

        gameRole.recoveryState(roleStateCaretaker.getRoleStateMemento());
        Assert.assertEquals(100,gameRole.getVitality());
        Assert.assertEquals(100,gameRole.getAttack());
        Assert.assertEquals(100,gameRole.getDefense());
    }
}
