package com.kern;
import com.kern.impl.HelloWorldImpl;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
/**
 * Created by kernwang on 2015/7/14.
 */

public class Server {
    public static void main(String[] args) throws Exception{

        JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
        factory.setServiceClass(HelloWorldImpl.class);
        factory.setAddress("http://localhost:9000/ws/HelloWorld");
        factory.create();
        System.out.println("Server start...");
        Thread.sleep(60 * 1000);
        System.out.println("Server exit...");
        System.exit(0);
    }
}
