package com.ssm;

import com.ssm.dao.IAccountDao;
import com.ssm.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class TestMyBatis {

    /**
     * 测试查询
     * @throws Exception
     */
    @Test
    public void run() throws Exception {
        //记载配置我呢见
        InputStream in =  Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //创建sqlSession对象
        SqlSession session = factory.openSession();
        //获得代理对象
        IAccountDao dao = session.getMapper(IAccountDao.class);
        //查询所有数据
        System.out.println(dao.finAll());
        //关闭资源
        session.close();
        in.close();
    }

    @Test
    public void save() throws Exception {
        Account account = new Account();
        account.setName("ccc");
        account.setMoney(500d);

        //记载配置我呢见
        InputStream in =  Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //创建sqlSession对象
        SqlSession session = factory.openSession();
        //获得代理对象
        IAccountDao dao = session.getMapper(IAccountDao.class);
        //查询所有数据
        dao.saveAccount(account);
        //提交事务
        session.commit();
        //关闭资源
        session.close();
        in.close();

    }

}
