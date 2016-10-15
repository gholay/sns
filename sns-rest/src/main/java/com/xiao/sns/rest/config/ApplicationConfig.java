package com.xiao.sns.rest.config;

import com.xiao.sns.rest.filter.RequestFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2016/10/9.
 */
@Configuration
public class ApplicationConfig {


    /**
     * 方法@Bean    public RequestFilter requestFilter()
     * 返回一个 RequestFilter 类的spring bean。
     * 当Spring Boot监测到有javax.servlet.Filter的bean时就会自动加入过滤器调用链。
     * @return
     */
    @Bean
    public RequestFilter requestFilter() {
        return new RequestFilter();
    }




}
