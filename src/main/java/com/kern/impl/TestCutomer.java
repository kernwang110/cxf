package com.kern.impl;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import javax.xml.ws.Endpoint;

/**
 * Created by kernwang on 2015/8/8.
 */
public class TestCutomer {

    public static String WS_URI = "http://127.0.0.1:8080/helloCustomer";
    public static void main(String[] args){


        Endpoint.publish(WS_URI,
                new HelloWorldImpl());
        clientCall();

    }


    public static String clientCall(){
        JaxWsProxyFactoryBean client = new JaxWsProxyFactoryBean();
        client.setAddress(WS_URI);
        client.setServiceClass(HelloWorld.class);
        client.getInInterceptors().add(new LoggingInInterceptor());
        client.getOutInterceptors().add(new LoggingOutInterceptor());
        HelloWorld a = (HelloWorld)client.create();
        System.out.println(a.sayHi("dddddd "));
        System.out.println(a.getCustomer());
        return null;
    }
}
