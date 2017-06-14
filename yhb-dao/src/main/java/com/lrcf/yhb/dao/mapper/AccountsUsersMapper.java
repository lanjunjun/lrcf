package com.lrcf.yhb.dao.mapper;

import com.lrcf.yhb.pojo.AccountsUsers;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountsUsersMapper {

    int deleteByPrimaryKey(String userid);


    int insert(AccountsUsers record);


    /**
     * 根据用户Id查询用户信息
     * @param userid
     * @return
     */
    AccountsUsers selectByPrimaryKey(String userid);

    /**
     * 根据用户手机号查询用户信息
     * @param userName 用户手机号
     * @return
     */
    AccountsUsers selectByUserName(String userName);


    List<AccountsUsers> selectAll();


    int updateByPrimaryKey(AccountsUsers record);
}