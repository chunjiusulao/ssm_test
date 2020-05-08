package com.itjm.service.impl;

import com.itjm.dao.AccountDao;
import com.itjm.domain.Account;
import com.itjm.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * @author 靳明
 * @Description:
 * @date 2020/5/6  11:58
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;



    @Override
    public List<Account> findAll() {
        System.out.println("业务层，查询所有账户。。。");
        return accountDao.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        String s = UUID.randomUUID().toString();
        account.setName(s);
        System.out.println(account);
        accountDao.saveAccount(account);

    }
}
