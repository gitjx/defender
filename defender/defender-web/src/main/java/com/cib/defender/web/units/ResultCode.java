package com.cib.defender.web.units;

import lombok.Getter;

/**
 * @ClassName:ResultCode
 * @Description: 响应码枚举
 * @Author:joyking
 * @Date:2020/10/19 3:59 PM
 * @Version:1.0
 **/
@Getter
public enum ResultCode {
    SUCCESS(1000,"操作成功"),
    FAILED(1001,"响应失败"),
    VALIDATE_FAILED(1002,"参数校验失败"),
    ERROR(5000,"未知错误");
    private int code;
    private String msg;
    ResultCode(int code,String msg){
        this.code = code;
        this.msg = msg;
    }
}
