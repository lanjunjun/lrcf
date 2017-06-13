package com.lrcf.yhb.service;

import com.lrcf.yhb.api.HelloService;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/6/12.
 */
@Service("helloService")
public class HelloServiceImpl implements HelloService{
    @Override
    public String hello(String name) {
        return "hello "+name;
    }
}
