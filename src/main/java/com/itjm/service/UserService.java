package com.itjm.service;

import com.itjm.domain.UserInfo;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

/**
 * @author 靳明
 * @Description: 用户方法类
 * @date 2020/5/15  18:35
 */
public interface UserService extends UserDetailsService {
    //查询所有
    public List<UserInfo> selectAll();
    //添加用户
    public int addUser(UserInfo userInfo);
    //根据id查询用户
    public UserInfo selectByPrimeryKey(String id);
    //根据用户名查询用户
    public UserInfo selectByUserName(String userName);
    //修改用户
    public int updateByPrimaryKey(UserInfo userInfo);
    //修改用户状态
    public int updateStatusByPrimaryKey(UserInfo userInfo);
    //删除用户
    public int deleteByPrimaryKey(String id);
    //查询用户详情
    public UserInfo selectDetailsByPrimaryKey(String id);
}
