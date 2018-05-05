package com.job.designpattern.decorator;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class DecoratorTest {

    @Test
    public void test() {
        Person tong = new Person("Tong");
        TShirts tShirts = new TShirts();
        BigTrouser bigTrouser = new BigTrouser();
        Sneakers sneakers = new Sneakers();
        Suit suit = new Suit();
        Tie tie = new Tie();
        LeatherShoes leatherShoes = new LeatherShoes();
        tShirts.decorate(tong);
        bigTrouser.decorate(tShirts);
        sneakers.decorate(bigTrouser);
        suit.decorate(sneakers);
        tie.decorate(suit);
        leatherShoes.decorate(tie);
        List<String> fineryList = leatherShoes.putOn(new ArrayList<>());

        Assert.assertEquals(LeatherShoes.class.getSimpleName(),fineryList.get(0));
        Assert.assertEquals(Tie.class.getSimpleName(),fineryList.get(1));
        Assert.assertEquals(Suit.class.getSimpleName(),fineryList.get(2));
        Assert.assertEquals(Sneakers.class.getSimpleName(),fineryList.get(3));
        Assert.assertEquals(BigTrouser.class.getSimpleName(),fineryList.get(4));
        Assert.assertEquals(TShirts.class.getSimpleName(),fineryList.get(5));
        Assert.assertEquals(Person.class.getSimpleName(),fineryList.get(6));
    }
}
