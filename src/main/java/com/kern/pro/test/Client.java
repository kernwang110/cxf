package com.kern.pro.test;

import com.kern.pro.EnterInter;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

/**
 * Created by kernwang on 2015/8/20.
 */
public class Client {
    static final String URL = "http://localhost:9191/test";

    public static void main(String[] args) throws InterruptedException {
        JaxWsProxyFactoryBean client = new JaxWsProxyFactoryBean();
        client.setAddress(URL);
        client.setServiceClass(EnterInter.class);

        EnterInter impl = (EnterInter)client.create();
        System.out.println(impl.serviceList("KERN HO HO 99555222");
        System.out.println(impl.serviceList("KERN HO HO 88666666");
    }
}
