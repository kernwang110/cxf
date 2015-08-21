package com.cxf.impl;

import com.cxf.exercise.domain.Customer;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * Created by kernwang on 2015/7/15.
 */
@WebService
public interface CustomerService {
    @WebMethod
    @WebResult
    Customer findCustomer(@WebParam String id);
}
