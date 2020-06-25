package com.itjm.utils;

import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;

/**
 * @author 靳明
 * @Description: 其他工具类
 * @date 2020/6/24  20:39
 */
public class OtherUtils {
    public static String getUsername(){
        SecurityContext context= SecurityContextHolder.getContext();//从上下文中获取当前登陆的用户
        User user = (User) context.getAuthentication().getPrincipal();
        String userName=user.getUsername();
        return userName;
    }
}
