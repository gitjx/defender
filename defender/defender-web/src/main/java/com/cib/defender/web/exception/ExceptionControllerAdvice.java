package com.cib.defender.web.exception;

import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @ClassName:ExceptionControllerAdvice
 * @Description:TODO
 * @Author:joyking
 * @Date:2020/10/15 9:22 PM
 * @Version:1.0
 **/
@RestControllerAdvice
public class ExceptionControllerAdvice {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public String MethodArgumentNotValidExceptionHandler(MethodArgumentNotValidException e){
        ObjectError objectError = e.getBindingResult().getAllErrors().get(0);
        return objectError.getDefaultMessage();
    }
    @ExceptionHandler(APIException.class)
    public String APIExceptionHandler(APIException e){
        System.out.println("call APIException...");
        return e.getMsg();
    }
}
