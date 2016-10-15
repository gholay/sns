package com.xiao.sns.rest;

import com.xiao.sns.rest.event.MyEvent;
import com.xiao.sns.rest.listener.MyListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2016/10/9.
 */
@SpringBootApplication
@RestController
public class Application  {

    @RequestMapping("/")
    public String greeting(HttpServletRequest request, HttpServletResponse response) {
        ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(request.getServletContext()) ;

        context.publishEvent(new MyEvent(new Object()));




        return "Hello World! we";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args)
                .addApplicationListener(new MyListener());


    }
}
