package com.example.demo.PersonDemo.domain;

/**
 * Created by gray- on 2017/8/4.
 *
 *
 * http 请求返回最外层对象
 */
public class Result<T> {

    //错误码
    private Integer code;


    //提示信息
    private String mesg;

    //具体的内容
    private T data;


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMesg() {
        return mesg;
    }

    public void setMesg(String mesg) {
        this.mesg = mesg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
