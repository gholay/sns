package com.xiao.sns.rest.listener;

import com.xiao.sns.rest.event.MyEvent;
import org.springframework.context.ApplicationListener;

/**
 * Created by Administrator on 2016/10/10.
 */
public class MyListener implements ApplicationListener<MyEvent> {

    @Override
    public void onApplicationEvent(MyEvent event) {
        System.out.println("------- event name -----------" + event.getName());
    }
}
