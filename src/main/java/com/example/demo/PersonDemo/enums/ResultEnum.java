package com.example.demo.PersonDemo.enums;

/**
 * Created by gray- on 2017/8/4.
 */
public enum ResultEnum {

    UNKNOW_ERROR(-1,"未知错误"),
    SUCCESS(0,"成功"),
    MAN(100,"你他妈是男的吧"),
    WOMAN(200,"你是个老女人吧"),

    ;

    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }


}
