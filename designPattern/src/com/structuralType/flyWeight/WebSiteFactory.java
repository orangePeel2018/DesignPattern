package com.structuralType.flyWeight;

import java.util.HashMap;
import java.util.Map;

public class WebSiteFactory {

    private Map<String,ConcreteWebSite> webSiteMap=new HashMap<>();

    public WebSite getWebSite(String type){
        WebSite webSite = webSiteMap.get(type);
        if(webSite==null){
            webSiteMap.put(type,new ConcreteWebSite(type));
        }
        return webSiteMap.get(type);
    }

    public int getWebSiteSize(){
        return  webSiteMap.size();
    }

}
