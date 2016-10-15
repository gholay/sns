package com.xiao.sns.rest.event;

import org.springframework.context.ApplicationEvent;

/**
 * Created by Administrator on 2016/10/10.
 * 参考来源：https://my.oschina.net/u/554240/blog/331886
 *
 *
 */
public class MyEvent extends ApplicationEvent {

    private String name  ;

    public MyEvent(String name) {

        super("");

        this.name = name ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
