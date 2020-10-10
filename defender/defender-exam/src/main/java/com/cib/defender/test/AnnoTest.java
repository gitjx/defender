package com.cib.defender.test;

import com.cib.defender.anno.MyController;

/**
 * @ClassName:AnnoTest
 * @Description:TODO
 * @Author:joyking
 * @Date:2020/9/28 8:20 PM
 * @Version:1.0
 **/
public class AnnoTest {
    public static void main(String[] args) throws ClassNotFoundException {
        String className = "com.cib.defender.bean.User";
        Class clazz = Class.forName(className);
        MyController controller = (MyController) clazz.getAnnotation(MyController.class);
        System.out.println(controller.url());
    }
}
