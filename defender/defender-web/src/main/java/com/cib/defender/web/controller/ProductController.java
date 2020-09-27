package com.cib.defender.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName:ProductController
 * @Description:TODO
 * @Author:joyking
 * @Date:2020/8/3 9:45 PM
 * @Version:1.0
 **/
@Controller
@RequestMapping("product")
public class ProductController {

    @RequestMapping("add")
    public String add(){
        return "product/add";
    }
    @RequestMapping("update")
    public String update(){
        return "product/update";
    }
    @RequestMapping("list")
    public String list(){
        return "product/list";
    }
    @RequestMapping("/delete")
    public String delete(){
        return "product/delete";
    }
}
