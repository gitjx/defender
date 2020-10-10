package com.cib.defender.bean;

import com.cib.defender.anno.MyController;

/**
 * @ClassName:User
 * @Description:TODO
 * @Author:joyking
 * @Date:2020/9/28 7:54 PM
 * @Version:1.0
 **/
@MyController(url = "baidu")
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

