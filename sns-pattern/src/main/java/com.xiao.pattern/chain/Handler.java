package com.xiao.pattern.chain;

/**
 * Created by Administrator on 2016/10/9.
 */
public abstract class Handler {
    Handler nextHandler ;

    public abstract void handRequest();


    public void setNextHandler(Handler nextHandler){
        this.nextHandler = nextHandler ;
    }

    public Handler getNextHandler(){
        return this.nextHandler ;
    }
}
