package com.job.designpattern.flyweight;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FlyweightTest {

    @Test
    public void test() {
        WebsiteFactory websiteFactory = new WebsiteFactory();

        Website productX = websiteFactory.getWebsiteCategory("product");
        productX.use(new User("Bill"));
        Website productY = websiteFactory.getWebsiteCategory("product");
        productY.use(new User(("Musk")));

        Website blogM = websiteFactory.getWebsiteCategory("blog");
        blogM.use(new User("Zuckerberg"));
        Website blogN = websiteFactory.getWebsiteCategory("blog");
        blogM.use(new User("Andy"));

        Assert.assertEquals(2, websiteFactory.getWebsiteCount());
        List<String> list = UseData.getInstance().getList();
        Assert.assertEquals(4, list.size());
        Assert.assertEquals("Bill use product", list.get(0));
        Assert.assertEquals("Musk use product", list.get(1));
        Assert.assertEquals("Zuckerberg use blog", list.get(2));
        Assert.assertEquals("Andy use blog", list.get(3));

    }
}
