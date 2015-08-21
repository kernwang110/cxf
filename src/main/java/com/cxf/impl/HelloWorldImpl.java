package com.cxf.impl;

import com.cxf.exercise.domain.Customer;

/**
 * Created by kernwang on 2015/7/14.
 */
public class HelloWorldImpl  implements HelloWorld{
    public String excludeSelfMethod() {
        return null;
    }

    public String sayHi(String name) {
        String msg = "Hello " + name + "!";
        return msg;
    }

    public Customer getCustomer(/*int id*/){
        Customer c = new Customer();
        c.setId(String.valueOf(33));
        c.setName("KernWang");
        return c;
    }
}
