package com.example.mttv.bean;

/**
 * @author zl
 * date 2019-04-28 9:37
 * description: 返回体实体类
 */
public class RespInfo<T> {

    private String msg;
     private int errorCode;
    private T data;

    private boolean success;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}