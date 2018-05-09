package com.job.designpattern.adapter;

import org.junit.Assert;
import org.junit.Test;

public class AdapterTest {

    @Test
    public void test() {
        Player james = new Forwards("James");
        Action jamesAttack = james.attack();

        Player kobe = new Guards("Kobe");
        Action kobeDefense = kobe.defense();

        Player yaoMing = new Translator("YaoMing");
        Action yaoMingAttack = yaoMing.attack();
        Action yaoMingDefense = yaoMing.defense();

        Assert.assertEquals("James", jamesAttack.getName());
        Assert.assertEquals(Forwards.class.getName(), jamesAttack.getClazz());
        Assert.assertEquals("attack", jamesAttack.getMethod());

        Assert.assertEquals("defense",kobeDefense.getMethod());

        Assert.assertEquals("YaoMing",yaoMingAttack.getName());
        Assert.assertEquals(ForeignCenter.class.getName(),yaoMingAttack.getClazz());
        Assert.assertEquals("attackForeign",yaoMingAttack.getMethod());
        Assert.assertEquals("defenseForeign",yaoMingDefense.getMethod());
    }
}
