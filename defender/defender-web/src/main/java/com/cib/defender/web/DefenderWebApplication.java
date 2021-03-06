package com.cib.defender.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName:DefenderWebApplication
 * @Description:TODO
 * @Author:joyking
 * @Date:2020/7/18 4:57 PM
 * @Version:1.0
 **/
@SpringBootApplication(scanBasePackages = "com.cib.defender")
@MapperScan("com.cib.defender.dao.mapper")
public class DefenderWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(DefenderWebApplication.class,args);
    }
}
