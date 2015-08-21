package com.cxf;

import com.cxf.impl.HelloWorld;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

/**
 * Created by kernwang on 2015/7/14.
 *
 */
/*
Note : http://m.blog.csdn.net/blog/woshishabiaaaaa/24868323 refer to
the different between JaxWsProxyFactoryBean & JaxWsDynamicClientFactory
 */
public class Client {
    public static void main(String[] args) {
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setServiceClass(HelloWorld.class);
        factory.setAddress("http://localhost:9000/ws/HelloWorld");
        HelloWorld helloworld = (HelloWorld) factory.create();
        System.out.println(helloworld.sayHi("kongxx"));
        System.exit(0);
    }
}
