package com.lrcf.yhb.admin;

import com.lrcf.yhb.api.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/6/12.
 */
@RestController
public class IndexController {

    @Autowired
    HelloService helloService;

    @RequestMapping("/")
    public String index(){
        return helloService.hello("xxx");
    }

}
