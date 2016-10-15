package com.xiao.pattern.chain;

/**
 * Created by Administrator on 2016/10/9.
 */
public class ConcreteHandler3 extends Handler {
    @Override
    public void handRequest() {
        System.out.println(ConcreteHandler3.class.getName() + "正在执行....");

        //这句话一定要有，要不然不会执行后面的处理代码
        if(this.nextHandler!=null){
            this.nextHandler.handRequest();
        }

    }
}
