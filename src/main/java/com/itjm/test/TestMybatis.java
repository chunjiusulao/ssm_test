package com.itjm.test;

import com.itjm.dao.AccountDao;
import com.itjm.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.UUID;

/**
 * @author 靳明
 * @Description: 测试mybatis
 * @date 2020/5/7  13:12
 */
public class TestMybatis {

    @Test
    public void run1() throws IOException {
        Account account=new Account();
        String uuid=UUID.randomUUID().toString();
        account.setId(uuid);
        account.setName("jjjjj");
        account.setMoney(115.01d);
        //加载mybatis配置文件
        InputStream is = Resources.getResourceAsStream("sqlMapConfig.xml");
        //创建SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        //创建SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //获取到代理对象
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);
       /* //查询所有数据
        List<Account> list = accountDao.findAll();
        for (Account account : list) {
            System.out.println(account);
        }*/
        System.out.println(account.getId());
       accountDao.saveAccount(account);
       //提交事务
        sqlSession.commit();
        //关闭资源
        sqlSession.close();
        is.close();

    }
}
