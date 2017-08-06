package com.example.demo.PersonDemo.exception;

import com.example.demo.PersonDemo.enums.ResultEnum;

/**
 * Created by gray- on 2017/8/4.
 */
public class PersonException extends RuntimeException {
    private Integer code;

    public PersonException(ResultEnum resultEnum){
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
