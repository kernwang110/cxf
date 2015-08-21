package com.cxf.exercise.integration;

import com.cxf.exercise.api.ServiceProvideInter;
import com.cxf.exercise.domain.Customer;

import javax.jws.WebParam;

/**
 * Created by kernwang on 2015/8/20.
 */
public class ServiceProvideInterImpl implements ServiceProvideInter {
    public String simpleAccess(String param) {
        System.out.println("hello "+param);
        return "hello "+param;
    }

    public Customer findCustomer(@WebParam String id) {
        return null;
    }
}
