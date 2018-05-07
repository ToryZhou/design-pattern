package com.job.designpattern.abstractfactory;

import org.junit.Assert;
import org.junit.Test;

public class AbstractFactoryTest {
    @Test
    public void test() {
        User bill = new User("1", "Bill");
        Department microsoft = new Department("1", "Microsoft");
        User musk = new User("2", "Musk");
        Department tesla = new Department("2", "Tesla");

        IFactory sqlServerFactory = new SqlServerFactory();
        IUser sqlServerUser = sqlServerFactory.createUser();
        IDepartment sqlServerDepartment = sqlServerFactory.createDepartment();
        sqlServerUser.insert(bill);
        sqlServerDepartment.insert(microsoft);
        Assert.assertEquals("Bill", SqlServer.getInstance().getUser("1").getName());
        Assert.assertEquals("Microsoft", SqlServer.getInstance().getDepartment("1").getName());

        IFactory accessFactory = new AccessFactory();
        IUser accessUser = accessFactory.createUser();
        IDepartment accessDepartment = accessFactory.createDepartment();
        accessUser.insert(musk);
        accessDepartment.insert(tesla);
        Assert.assertEquals("Musk", Access.getInstance().getUser("2").getName());
        Assert.assertEquals("Tesla", Access.getInstance().getDepartment("2").getName());
    }
}
