package com.xiao.test.http.request;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import static org.springframework.http.HttpMethod.GET;

/**
 * Created by gao.lei on 2016/10/8.
 */
public class RestUtil2 {

    //private static final String APPLICATION_PDF = "application/pdf";
    public static void main(String []args) {
        loadURL() ;
    }

    public static void loadURL(){
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.set("_pid","16");
        HttpEntity<String> entity = new HttpEntity<String>( headers);

            ResponseEntity<String> exchange = restTemplate.exchange("http://snsapi.xiaoyi.com/medias/index?v=v3.2", GET, entity, String.class);
            //ResponseEntity<String> exchange = restTemplate.exchange("http://localhost:8032/index/header?v=v3.2", GET, entity, String.class);
            // System.out.println(exchange.getBody());

                System.out.println(exchange.getHeaders().get("ETag") + "--" + exchange.getHeaders().get("ETag"));

    }

}
