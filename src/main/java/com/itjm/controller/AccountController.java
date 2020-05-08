package com.itjm.controller;

import com.itjm.domain.Account;
import com.itjm.service.AccountService;
import com.sun.deploy.net.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author 靳明
 * @Description:账户web
 * @date 2020/5/6  11:59
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public String  findAll(Model model){
        System.out.println("测试springmvc的搭建");
        //调用service方法
        List<Account> list = accountService.findAll();
        model.addAttribute("list",list);
        return "success";
    }

    @RequestMapping("/save")
    public void   saveAccount (HttpServletRequest request, HttpServletResponse response, Account account) throws IOException {
        System.out.println("测试springmvc的搭建");
        //调用service方法
        accountService.saveAccount(account);
        response.sendRedirect(request.getContextPath()+"account/findAll");
    }
}
