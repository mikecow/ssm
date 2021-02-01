package com.ssm.service;

import com.ssm.domain.Account;

import java.util.List;

public interface IAccountService {
    /**
     * 查询所有账户
     * @return  存有所有账户的list
     */
    public List<Account> finAll();


    /**
     * 保存账户信息
     */
    public void saveAccount(Account account);
}
