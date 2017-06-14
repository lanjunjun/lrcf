package com.lrcf.yhb.service;



import com.lrcf.yhb.api.AccountsUsersService;
import com.lrcf.yhb.dao.mapper.AccountsUsersMapper;
import com.lrcf.yhb.pojo.AccountsUsers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2017/6/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class AccountsServiceTest {
    @Autowired
    private AccountsUsersService accountsUsersService;


    @Test
    public void test(){
        AccountsUsers acu = accountsUsersService.getUserByUserId("0005825c-f543-4721-9b84-a94e004bd75f");
        System.out.println(acu.getUsername());


    }

}
