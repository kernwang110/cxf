package com.kern.pro;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import java.util.Collection;

/**
 * Created by kernwang on 2015/8/20.
 */
@WebService
public interface EnterInter {
    @WebMethod(operationName = "serviceList")
    @WebResult
    String serviceList(@WebParam String param);

}
