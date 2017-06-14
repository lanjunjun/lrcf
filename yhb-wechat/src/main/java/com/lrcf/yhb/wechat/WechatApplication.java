package com.lrcf.yhb.wechat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by Administrator on 2017/6/14.
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.lrcf.yhb.api","com.lrcf.yhb.wechat.controller"})
@ImportResource({"classpath:dubbo-wechat.xml"})
public class WechatApplication {

    public static void main(String[] args) {
        SpringApplication.run(WechatApplication.class,args);
    }
}
