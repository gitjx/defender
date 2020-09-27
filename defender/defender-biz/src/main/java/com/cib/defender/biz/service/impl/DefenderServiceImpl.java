package com.cib.defender.biz.service.impl;

import com.cib.defender.biz.service.DefenderService;
import org.springframework.stereotype.Service;

/**
 * @ClassName:DefenderServiceImpl
 * @Description:TODO
 * @Author:joyking
 * @Date:2020/7/18 5:12 PM
 * @Version:1.0
 **/
@Service
public class DefenderServiceImpl implements DefenderService {
    @Override
    public String test() {
        return "service test";
    }
}
