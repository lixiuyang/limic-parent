package com.lixiuyang.exception;

import com.lixiuyang.utils.Result;
import com.lixiuyang.utils.StatusCode;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobeExceptionHandler {

    //指定出现什么异常执行这个方法
    @ExceptionHandler(value = UserAcessException.class)
    @ResponseBody//为了返回数据
    public Result errorException(UserAcessException e) {
        e.printStackTrace();
        return new Result(false, StatusCode.ACCESSERROR, e.getMessage());
    }

}
