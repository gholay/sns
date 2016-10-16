package com.xiao.reflect;

import com.xiao.reflect.Bean.User;

import java.lang.reflect.Constructor;

/**
 * 使用反射动态创建对象实例     有两种方式：
 * 方法一：通过Class的newInstance()方法
 * 方法二：通过Constructor的newInstance() 方法
 * 参考网站：http://blog.csdn.net/l19921009/article/details/8214542
 * http://ifeve.com/java-reflection-tutorial/
 * Created by Administrator on 2016/10/15.
 */
public class ReflectConstructorDemo {
    public static void main(String[] args) throws Exception {

        Class clz = Class.forName("com.xiao.reflect.Bean.User") ;

        Constructor constructor = clz.getDeclaredConstructor(String.class, int.class) ;
        User user1 = (User)constructor.newInstance("gaolei2" , 23) ;
        User user2 = (User)clz.newInstance();

        System.out.println(user1);
        System.out.println(user2);

    }
}
