package com.cxf.impl;

/**
 * Created by kernwang on 2015/7/14.
 */
import com.cxf.exercise.domain.Customer;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
//SEI(Service EndPoint Interface)
@WebService/*(targetNamespace="ws.com.cxf.integration")*/
public interface HelloWorld {
    @WebMethod(operationName="sayHiOpName")
    @WebResult String sayHi(@WebParam(name="sayContext") String text);

    @WebMethod(exclude = true)
    @WebResult String excludeSelfMethod();

    @WebMethod(operationName="getCustomerOpName")
    @WebResult
    Customer getCustomer(/*@WebParam(name="customerId") int id*/);

    

}
