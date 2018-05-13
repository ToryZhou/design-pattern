package com.job.designpattern.mediator;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class MediatorTest {

    @Test
    public void test() {
        UnitedNationsSecurityCouncil unitedNationsSecurityCouncil = new UnitedNationsSecurityCouncil();
        USA usa = new USA(unitedNationsSecurityCouncil);
        Iran iran = new Iran(unitedNationsSecurityCouncil);
        unitedNationsSecurityCouncil.setUsa(usa);
        unitedNationsSecurityCouncil.setIran(iran);

        String usaDeclare = "Nuclear weapons are not allowed to be developed, or war will be launched.";
        usa.declare(usaDeclare);
        String iranDeclare = "We do not have nuclear weapons, and we are not afraid of aggression.";
        iran.declare(iranDeclare);

        List<String> list = MessageData.getInstance().getList();
        Assert.assertEquals(2, list.size());
        Assert.assertEquals(Iran.class.getSimpleName() + "getMessage" + usaDeclare, list.get(0));
        Assert.assertEquals(USA.class.getSimpleName() + "getMessage" + iranDeclare, list.get(1));
    }
}
