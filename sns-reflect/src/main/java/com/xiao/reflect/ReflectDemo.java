package com.xiao.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2016/10/14.
 */
class User {
    private String name = "gaolei" ;
    private int age = 30 ;

    public User(){

    }

    public User(String name , int age){
        this.name = name ;
        this.age = age ;
    }


    public String getInfo(){
        return name + " --> " + age ;
    }


}
public class ReflectDemo {

    public static void main(String[] args) throws Exception {

        Class userClz = Class.forName("com.xiao.reflect.User") ;

        Constructor[] constructors = userClz.getDeclaredConstructors();
        for(Constructor con : constructors){
            System.out.println(con);
        }

        Field[] fields = userClz.getDeclaredFields() ;
        for(Field field : fields){
            System.out.println(field);
        }

        Object obj = userClz.newInstance();

        Method[] methods = userClz.getDeclaredMethods() ;
        for (Method method : methods){
            String ret = (String)method.invoke(obj , null) ;
            System.out.println(ret);
        }
    }

}
