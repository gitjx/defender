package com.cib.defender.web.config;

import org.springframework.context.annotation.Configuration;


/**
 * @ClassName:SecurityConfig
 * @Description:TODO
 * @Author:joyking
 * @Date:2020/7/25 3:43 PM
 * @Version:1.0
 **/
//@Configuration
//@EnableWebSecurity  //开启Spring Security过滤器链
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//    /**
//     * 自定义配置,主要完成以下功能：
//     * 1、配置拦截的资源
//     * 2、权限不足时的处理
//     * 3、资源对应的角色
//     */
//    protected void configure(HttpSecurity http) throws Exception {
////        http.authorizeRequests()
////                .antMatchers("/css/**","/js/**","/fonts/**","/index").permitAll()
////                .antMatchers("/users/**").hasRole("ADMIN")
////                .and()
////                .formLogin()
////                .loginPage("/login").failureUrl("/login-error");
//
//
////        http.authorizeRequests()
////                .antMatchers("/product/add").hasAuthority("PRODUCT_ADD")
////                .antMatchers("/product/update").hasAuthority("PRODUCT_UPDATE")
////                .antMatchers("/product/list").hasAuthority("PRODUCT_LIST")
////                .antMatchers("/product/delete").hasAuthority("PRODUCT_DELETE")
////                .antMatchers("/**")
////                .fullyAuthenticated()
////                .and()
////                .formLogin();
//
//        // 关闭所有security认证
//        http.authorizeRequests()
//                .anyRequest().permitAll().and().logout().permitAll();
//    }
//
//    /**
//     * 认证信息管理
//     */
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication()
//                .passwordEncoder(new BCryptPasswordEncoder())
//                .withUser("chenhao")
//                .password(new BCryptPasswordEncoder().encode("123"))
//                .authorities("PRODUCT_UPDATE","PRODUCT_ADD");
//    }
//}
