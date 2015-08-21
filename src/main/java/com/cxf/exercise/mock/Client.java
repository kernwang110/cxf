package com.cxf.exercise.mock;

import com.cxf.exercise.api.ServiceProvideInter;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

/**
 * Created by kernwang on 2015/8/20.
 */
public class Client {
    static final String URL = "http://localhost:9191/mock";

    public static void main(String[] args) throws InterruptedException {
        JaxWsProxyFactoryBean client = new JaxWsProxyFactoryBean();
        client.setAddress(URL);
        client.setServiceClass(ServiceProvideInter.class);

        ServiceProvideInter impl = (ServiceProvideInter)client.create();

        System.out.println(impl.simpleAccess("KERN COME ON"));
        System.out.println(impl.simpleAccess("KERN GO ON"));
    }
}
