package com.itjm.dao;

import com.itjm.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 靳明
 * @Description: 账户Dao接口
 * @date 2020/5/6  11:46
 */
@Repository
public interface AccountDao {

    //查询所有账户信息
    public List<Account> findAll();

    //保存账户信息
    public void saveAccount(Account account);




}
