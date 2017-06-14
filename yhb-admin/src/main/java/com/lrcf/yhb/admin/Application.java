package com.lrcf.yhb.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * Hello world!
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.lrcf.yhb.api","com.lrcf.yhb.admin.controller"})
@ImportResource({"classpath:dubbo-admin.xml"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
