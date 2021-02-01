package com.ssm.dao;

import com.ssm.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("accountDao")
public interface IAccountDao {

    /**
     * 查询所有账户
     * @return  存有所有账户的list
     */
    @Select("select * from account")
    public List<Account> finAll();


    /**
     * 保存账户
     * @param account 需要保存的实体
     */
    @Insert("insert into account(name, money) values(#{name}, #{money})")
    public void saveAccount(Account account);

}
