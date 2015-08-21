package com.cxf.exercise.api;

import com.cxf.exercise.domain.Customer;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * Created by kernwang on 2015/8/20.
 */
@WebService
public interface ServiceProvideInter {
    @WebMethod(operationName = "serviceList")
    @WebResult
    String simpleAccess(@WebParam String param);

    @WebMethod
    @WebResult
    Customer findCustomer(@WebParam String id);

}
