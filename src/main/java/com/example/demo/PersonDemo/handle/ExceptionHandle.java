package com.example.demo.PersonDemo.handle;

import com.example.demo.PersonDemo.domain.Result;
import com.example.demo.PersonDemo.exception.PersonException;
import com.example.demo.PersonDemo.untils.ResultUntils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by gray- on 2017/8/4.
 */

@ControllerAdvice
public class ExceptionHandle {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e){

        if(e instanceof PersonException){
            PersonException personException = (PersonException)e;
            return ResultUntils.error(personException.getCode(), personException.getMessage());
        }else{
            return ResultUntils.error(-1,"未知错误！");
        }
    }
}
