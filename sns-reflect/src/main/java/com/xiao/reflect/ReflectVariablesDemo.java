package com.xiao.reflect;

import com.xiao.reflect.Bean.User;

import java.lang.reflect.Field;

/**
 * Created by Administrator on 2016/10/16.
 * 参考：http://ifeve.com/java-reflection-tutorial/
 * 使用Java反射机制你可以运行期检查一个类的变量信息(成员变量)或者获取或者设置变量的值
 * 获取私有变量: Class.getDeclaredField(String name)或Class.getDeclaredFields()方法。
 * 获取公有变量: Class.getField(String name)和Class.getFields()只会返回公有的变量，无法获取私有变量
 */
public class ReflectVariablesDemo {

    public static void main(String[] args) throws Exception {
        Class clz = User.class ;

        User user = (User) clz.newInstance() ;

        Field name  = clz.getDeclaredField("name") ;
        name.setAccessible(true);
        name.set(user , "sunborong");

        System.out.println(name.get(user));

    }
}
