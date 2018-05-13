package com.job.designpattern.flyweight;

import java.util.Hashtable;

public class WebsiteFactory {

    private Hashtable<String, Website> hashtable = new Hashtable<>();

    public Website getWebsiteCategory(String key) {
        if (!hashtable.contains(key)) {
            hashtable.put(key, new ConcreteWebsite(key));
        }
        return hashtable.get(key);
    }

    public int getWebsiteCount(){
        return this.hashtable.size();
    }
}
