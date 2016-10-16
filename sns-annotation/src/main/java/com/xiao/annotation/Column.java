package com.xiao.annotation;

import java.lang.annotation.*;

/**
 * Created by Administrator on 2016/10/16.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Column {

    public String name() ;
    public String setFuncName();
    public String getFuncName();

}
