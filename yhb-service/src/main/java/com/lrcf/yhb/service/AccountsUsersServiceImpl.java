package com.lrcf.yhb.service;

import com.lrcf.yhb.api.AccountsUsersService;
import com.lrcf.yhb.dao.mapper.AccountsUsersMapper;
import com.lrcf.yhb.pojo.AccountsUsers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/6/13.
 */
@Service("accountsUsersService")
public class AccountsUsersServiceImpl implements AccountsUsersService {


    @Autowired
    AccountsUsersMapper accountsUsersMapper;

    @Override
    public AccountsUsers getUserInfoByPhone(String phone) {
        return accountsUsersMapper.selectByPrimaryKey(phone);
    }

    @Override
    public AccountsUsers getUserByUserId(String userId) {
        return accountsUsersMapper.selectByPrimaryKey(userId);
    }
}
