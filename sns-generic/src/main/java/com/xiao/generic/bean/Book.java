package com.xiao.generic.bean;

/**
 * Created by Administrator on 2016/10/16.
 */
public class Book<T> {
    private T t ;
    public Book(){

    }

    public Book(T t){
        this.t = t ;
    }

    public T getData(){
        return t ;
    }
}


