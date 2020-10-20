package com.cib.defender.web.exception;

import lombok.Getter;

/**
 * @ClassName:APIException
 * @Description:TODO
 * @Author:joyking
 * @Date:2020/10/17 3:44 PM
 * @Version:1.0
 **/
@Getter
public class APIException extends RuntimeException {
    private int code;
    private String msg;
    public APIException(){
        this(1001,"接口错误");
    }
    public APIException(String msg){
        this(1001,msg);
    }
    public APIException(int code,String msg){
        super(msg);
        this.code = code;
        this.msg = msg;
    }
}
