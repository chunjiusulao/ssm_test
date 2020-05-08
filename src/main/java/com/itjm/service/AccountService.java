package com.itjm.service;

import com.itjm.domain.Account;

import java.util.List;

/**
 * @author 靳明
 * @Description:
 * @date 2020/5/6  11:56
 */
public interface AccountService {


    //查询所有账户信息
    public List<Account> findAll();

    //保存账户信息
    public void saveAccount(Account account);

}
