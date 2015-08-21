package com.kern;

import com.kern.impl.Customer;
import com.kern.impl.CustomerService;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import javax.xml.ws.WebServiceException;
import java.net.SocketTimeoutException;

/**
 * Created by kernwang on 2015/7/15.
 */
public class ClientCrm {
    public static void main(String[] args) throws Exception {
        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
        factoryBean.setAddress("http://localhost:9000/ws/jaxws/customerService");
        factoryBean.setServiceClass(CustomerService.class);
        Object obj = factoryBean.create();

        CustomerService customerService = (CustomerService) obj;
        try {
            Customer customer = customerService.findCustomer("123");
            System.out.println("Customer: " + customer);
        } catch(Exception e) {
            if (e instanceof WebServiceException
                    && e.getCause() instanceof SocketTimeoutException) {
                System.err.println("This is timeout exception.");
            } else {
                e.printStackTrace();
            }
        }
    }
}
