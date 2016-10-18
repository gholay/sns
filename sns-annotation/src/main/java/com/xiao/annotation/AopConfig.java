package com.xiao.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by Administrator on 2016/10/18.
 */
@Configuration
@ComponentScan("com.xiao.annotation")
@EnableAspectJAutoProxy
public class AopConfig {

}
