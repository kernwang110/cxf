package com.cxf;

import com.cxf.impl.CustomerServiceImpl;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

/**
 * Created by kernwang on 2015/7/15.
 */
public class ServerCrm {
    private static final String address = "http://localhost:9000/ws/jaxws/customerService";

    public static void main(String[] args) throws Exception {
        // http://localhost:9000/ws/jaxws/customerService?wsdl
        JaxWsServerFactoryBean factoryBean = new JaxWsServerFactoryBean();
        factoryBean.getInInterceptors().add(new LoggingInInterceptor());
        factoryBean.getOutInterceptors().add(new LoggingOutInterceptor());

        factoryBean.setServiceClass(CustomerServiceImpl.class);
        factoryBean.setAddress(address);
        factoryBean.create();
    }
}
