package com.kern.pro.test;

import com.kern.pro.impl.EnterInterImpl;
import org.apache.cxf.interceptor.Interceptor;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

import javax.xml.namespace.QName;

/**
 * Created by kernwang on 2015/8/20.
 */
public class Server {
    static final String URL = "http://localhost:9191/test";

    public static void main(String[] args) throws InterruptedException {
        JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
        factory.setServiceClass(EnterInterImpl.class);
        factory.setAddress(URL);
        factory.setEndpointName(new QName("KERN.TEST"));

        factory.getInInterceptors().add(new LoggingInInterceptor());
        factory.getOutInterceptors().add(new LoggingOutInterceptor());

        factory.create();

        for (Interceptor inter : factory.getInInterceptors()) {
            System.out.println(inter.toString());
        }
        System.out.println("Server start...");
        Thread.sleep(61 * 1000);
        System.out.println("Server exit...");
        System.exit(0);

    }
}
