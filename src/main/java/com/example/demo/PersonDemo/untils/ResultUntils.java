package com.example.demo.PersonDemo.untils;

import com.example.demo.PersonDemo.domain.Result;

/**
 * Created by gray- on 2017/8/4.
 */
public class ResultUntils {

    //成功返回对象
    public static Result success(Object object){
        Result result = new Result();

        result.setCode(0);
        result.setMesg("成功");
        result.setData(object);

        return result;
    }

    //成功不返回对象
    public static Result success(){
        return success(null);
    }


    public static Result error(Integer code, String msg){
        Result result = new Result();

        result.setCode(code);
        result.setMesg(msg);
        result.setData(null);

        return result;

    }

}
