package com.edu.servicebase.handler;

import com.edu.tools.R;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description:
 * @author: zzx
 * @createDate: 2020/6/2
 * @version: 1.0
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    //拦截自定义异常
    //拦截自定义异常
    @ExceptionHandler(BusinessException .class)
    @ResponseBody
    public R error(BusinessException e){
        e.printStackTrace();
        return R.error().code(e.getCode()).message(e.getMsg());
    }

    //很重要，括号类制定需要拦截的异常，也可以进行定制化
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public R error(Exception e){
        e.printStackTrace();
        return R.error().message("执行全局异常处理。。。");
    }
}
