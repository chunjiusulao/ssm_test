package com.itjm.test;

import com.itjm.service.AccountService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 靳明
 * @Description:
 * @date 2020/5/6  12:24
 */
public class TestSpring {

    @Test
    public void run1(){
        //加载配置文件
        ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //获取对象
        AccountService accountService = (AccountService) ac.getBean("accountService");
        //调用方法
        accountService.findAll();
    }

}
