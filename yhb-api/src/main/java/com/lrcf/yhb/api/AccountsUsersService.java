package com.lrcf.yhb.api;


import com.lrcf.yhb.pojo.AccountsUsers;

/**
 * Created by Administrator on 2017/6/13.
 */
public interface AccountsUsersService {


    AccountsUsers getUserInfoByPhone(String phone);

    AccountsUsers getUserByUserId(String userId);
}
