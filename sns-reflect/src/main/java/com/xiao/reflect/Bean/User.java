package com.xiao.reflect.Bean;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2016/10/15.
 */
public class User {
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

    public List<String> getArrayList(){
        return Arrays.asList("a", "b", "c");
    }


    @Override
    public String toString() {
        return "toString: "+ name + " --> " + age ;
    }
}
