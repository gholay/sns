package com.xiao.sns.rest.filter;


import javax.servlet.*;
import java.io.IOException;

/**
 * Created by Administrator on 2016/10/9.
 */
public class RequestFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("filter ....  ");
        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {

    }
}
