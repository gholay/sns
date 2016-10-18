package com.xiao.annotation;

import java.lang.annotation.*;

/**
 * Created by Administrator on 2016/10/18.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
