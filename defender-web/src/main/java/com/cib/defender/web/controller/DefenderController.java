package com.cib.defender.web.controller;

import com.cib.defender.biz.service.DefenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cib.defender.*;

/**
 * @ClassName:DefenderController
 * @Description:TODO
 * @Author:joyking
 * @Date:2020/7/18 5:00 PM
 * @Version:1.0
 **/
@RestController
@RequestMapping("defender")
public class DefenderController {
    @Autowired
    private DefenderService defenderService;

    @GetMapping("index")
    public String index() {
        return defenderService.test();
    }
}
