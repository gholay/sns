package com.xiao.annotation;

import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/10/18.
 */
@Service
public class DemoAnnotationService {
    @Action(name="注解式拦截add操作")
    public void add(){

    }

}
