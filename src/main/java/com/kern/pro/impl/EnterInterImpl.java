package com.kern.pro.impl;

import com.kern.pro.EnterInter;

import java.util.Collection;

/**
 * Created by kernwang on 2015/8/20.
 */
public class EnterInterImpl implements EnterInter {
    public String serviceList(String param) {
        System.out.println("hello "+param);
        return "hello "+param;
    }
}
