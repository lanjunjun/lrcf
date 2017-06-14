package com.lrcf.yhb.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/6/14.
 */
@RestController
public class AccounsUserController {


    @RequestMapping("/getuserName")
    public String getUserName(){
        return "18337114254";
    }
}
