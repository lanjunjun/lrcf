package com.lrcf.yhb.wechat.controller;

import com.lrcf.yhb.api.AccountsUsersService;
import com.lrcf.yhb.pojo.AccountsUsers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/6/14.
 */
@RestController
public class AccountsUserController {

    @Autowired
    private AccountsUsersService accountsUsersService;

    @RequestMapping("/getuserName")
    public String getUserName(){
        return "18337114254";
    }


    @RequestMapping("/index")
    public AccountsUsers indexAcc(){
        return accountsUsersService.getUserByUserId("0005825c-f543-4721-9b84-a94e004bd75f");
    }
}
