package com.lrcf.yhb.admin;

import com.lrcf.yhb.api.AccountsUsersService;
import com.lrcf.yhb.api.HelloService;
import com.lrcf.yhb.pojo.AccountsUsers;
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
    @Autowired
    AccountsUsersService accountsUsersService;

    @RequestMapping("/")
    public String index(){
        return helloService.hello("xxx");
    }


    @RequestMapping("/index")
    public AccountsUsers indexAcc(){
        return accountsUsersService.getUserByUserId("0005825c-f543-4721-9b84-a94e004bd75f");
    }

}
