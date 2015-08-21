package com.cxf.impl;

import com.cxf.exercise.domain.Customer;

/**
 * Created by kernwang on 2015/7/15.
 */
public class CustomerServiceImpl implements CustomerService {
    public Customer findCustomer(String id) {
        Customer customer = new Customer();
        customer.setId("customer_" + id);
        customer.setName("customer_name");
        //customer.setBirthday(Calendar.getInstance().getTime());
        return customer;
    }
}
