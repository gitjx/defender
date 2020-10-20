package com.cib.defender.web.config;

import org.springframework.boot.web.server.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

/**
 * @ClassName:ErrorPageConfig
 * @Description:TODO
 * @Author:joyking
 * @Date:2020/8/4 7:28 AM
 * @Version:1.0
 **/
//@Component
//public class ErrorPageConfig implements ErrorPageRegistrar {
//
//    @Override
//    public void registerErrorPages(ErrorPageRegistry registry) {
//        ErrorPage error403Page = new ErrorPage(HttpStatus.FORBIDDEN, "/defender/403");
//        ErrorPage error400Page = new ErrorPage(HttpStatus.BAD_REQUEST, "/error400Page");
//        ErrorPage error401Page = new ErrorPage(HttpStatus.UNAUTHORIZED, "/error401Page");
//        ErrorPage error404Page = new ErrorPage(HttpStatus.NOT_FOUND, "/error404Page");
//        ErrorPage error500Page = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/error500Page");
//        registry.addErrorPages(error403Page,error400Page,error401Page,error404Page,error500Page);
//    }
//}
