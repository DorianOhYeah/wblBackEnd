package com.mscproject.wbl.controller;

public class BaseResponse<T> {
    private boolean success;
    private String message;
    private T data;

    public  BaseResponse(){
        this.success=false;
        this.message = "wbl";
    }
    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}