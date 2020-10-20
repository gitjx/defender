package com.cib.defender.web.units;

import lombok.Getter;

/**
 * @ClassName:ResultVO
 * @Description: 定义统一的响应体
 * @Author:joyking
 * @Date:2020/10/19 4:38 PM
 * @Version:1.0
 **/
@Getter
public class ResultVO<T> {

    private int code;
    private String msg;
    private T data;

    public ResultVO(T data){
        this(ResultCode.SUCCESS,data);
    }
    public ResultVO(ResultCode resultCode,T data){
        this.code = resultCode.getCode();
        this.msg = resultCode.getMsg();
        this.data = data;
    }
}
