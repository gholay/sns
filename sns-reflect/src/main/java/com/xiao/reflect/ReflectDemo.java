package com.xiao.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectDemo {

    public static void main(String[] args) throws Exception {

        Class userClz = Class.forName("com.xiao.reflect.Bean.User") ;


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
            //String ret = (String)method.invoke(obj , null) ;
            System.out.println(method );

        }

        Method getArrayList = userClz.getDeclaredMethod("getArrayList");
        Class cls = getArrayList.getReturnType() ;
        Class parameterTypes[] = getArrayList.getParameterTypes();

        for (Class clzz : parameterTypes){
            System.out.println(clzz);
        }
        //List list = (List)getArrayList.invoke(obj , null) ;
        //System.out.println(list);




    }

}
