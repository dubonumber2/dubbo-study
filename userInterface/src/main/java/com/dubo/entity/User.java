package com.dubo.entity;

import java.io.Serializable;

public class User implements Serializable{
    private String operation_name;
    private String operation_explain;
    private String user_name;
    private String operation_time;

    public String getOperation_name() {
        return operation_name;
    }

    public void setOperation_name(String operation_name) {
        this.operation_name = operation_name;
    }

    public String getOperation_explain() {
        return operation_explain;
    }

    public void setOperation_explain(String operation_explain) {
        this.operation_explain = operation_explain;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getOperation_time() {
        return operation_time;
    }

    public void setOperation_time(String operation_time) {
        this.operation_time = operation_time;
    }
}
