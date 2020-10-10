package com.cib.defender;

import com.cib.defender.bean.User;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        System.out.println( "Hello World!" );
        User user = new User();
        user.setName("chenhao");
        System.out.println(user.getName());

        // 利用反射，实现类实例的初始化和方法获取
        String className = "com.cib.defender.bean.User";
        Class clazz = Class.forName(className);
        Object instance = (Object) clazz.newInstance();
        Method setMethod = clazz.getMethod("setName",String.class);
        setMethod.invoke(instance,"hello,chenhao");
        Method getMethod = clazz.getMethod("getName",null);
        Object value = getMethod.invoke(instance);
        System.out.println(value);
    }
}
