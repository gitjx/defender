package com.cib.defender.anno;

import java.lang.annotation.*;

/**
 * @ClassName:MyController
 * @Description:TODO
 * @Author:joyking
 * @Date:2020/9/28 8:08 PM
 * @Version:1.0
 **/
// 自定义注解
@Target(ElementType.TYPE)  // 注解范围
@Retention(RetentionPolicy.RUNTIME)   //注解生命周期
@Inherited
@Documented
public @interface MyController {
    String url();
    String email() default "";
}
