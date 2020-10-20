package com.cib.defender.web.controller;

import com.cib.defender.biz.service.DefenderService;
import com.cib.defender.biz.service.UserService;
import com.cib.defender.dao.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cib.defender.*;

import java.util.List;

/**
 * @ClassName:DefenderController
 * @Description:TODO
 * @Author:joyking
 * @Date:2020/7/18 5:00 PM
 * @Version:1.0
 **/
@Controller
@RequestMapping("defender")
public class DefenderController {
    @Autowired
    private DefenderService defenderService;
    @Autowired
    UserService userService;

    @GetMapping("/")
    public String root(){
        return "redirect:/index";
    }

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/login-error")
    public String loginError(Model model){
        model.addAttribute("loginError",true);
        model.addAttribute("errorMsg","登录失败，用户名或者密码错误!");
        return "login";
    }

    @RequestMapping("403")
    public String forbidden(){
        return "error/403";
    }
}
