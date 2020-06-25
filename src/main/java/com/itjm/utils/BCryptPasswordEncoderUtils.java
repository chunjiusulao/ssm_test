package com.itjm.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author 靳明
 * @Description: 密码加密工具类
 * @date 2020/5/19  16:54
 */
public class BCryptPasswordEncoderUtils {

    public static BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder();

    public static String encodePassword(String password){
        return bCryptPasswordEncoder.encode(password);
    }

}
