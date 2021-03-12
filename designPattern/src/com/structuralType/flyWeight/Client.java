package com.structuralType.flyWeight;



public class Client {
    public static void main(String[] args) {
        User user=new User("fys",12);
        WebSiteFactory webSiteFactory=new WebSiteFactory();
        WebSite web = webSiteFactory.getWebSite("web");
        web.use(user);
        System.out.println(webSiteFactory.getWebSiteSize());

        System.out.println("-------------------------");
        WebSite tb = webSiteFactory.getWebSite("tb");
        tb.use(user);
        System.out.println(webSiteFactory.getWebSiteSize());
    }
}
