package com.cxf.exercise.domain;

/**
 * Created by kernwang on 2015/7/15.
 */
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Customer")
public class Customer {
    private String id;
    private String name;
    //private Date birthday;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
//    public Date getBirthday() {
//        return birthday;
//    }
//    public void setBirthday(Date birthday) {
//        this.birthday = birthday;
//    }
    @Override
    public String toString() {
        return org.apache.commons.lang.builder.ToStringBuilder.reflectionToString(this);
    }
}