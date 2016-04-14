package com;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by pupil on 2016/4/11.
 */
public class helloWorld extends ActionSupport {
    @Override
    public String execute() throws Exception {
        System.out.println("I hate SSH!");
        return SUCCESS;
    }
    public String add(){
        return "add";
    }
    public String update(){
        return "update";
    }
}
