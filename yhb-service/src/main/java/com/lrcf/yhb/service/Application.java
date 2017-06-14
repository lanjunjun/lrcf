package com.lrcf.yhb.service;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

import java.util.concurrent.CountDownLatch;

/**
 * Created by Administrator on 2017/6/13.
 */
@SpringBootApplication
//@ImportResource({"classpath:dubbo-services.xml"})
public class Application {

//    private static final Logger logger = LoggerFactory.getLogger(Application.class);
//
//    @Bean
//    public CountDownLatch closeLatch() {
//        return new CountDownLatch(1);
//    }
//
//    public static void main(String[] args) throws InterruptedException {
//
//        ApplicationContext ctx = new SpringApplicationBuilder().sources(Application.class).web(false).run(args);
//
//        logger.info("项目启动!");
//
//        CountDownLatch closeLatch = ctx.getBean(CountDownLatch.class);
//        closeLatch.await();
//    }
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
        System.in.read(); // 为保证服务一直开着，利用输入流的阻塞来模拟
    }
}
