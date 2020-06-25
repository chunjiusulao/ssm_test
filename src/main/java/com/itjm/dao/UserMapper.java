package com.itjm.dao;

import com.itjm.domain.UserInfo;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(String id);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
    // 根据用户名查找用户
    UserInfo selectByUserName(String userName);
    // 查询所有用户
    List<UserInfo> selectAll();
    // 根据id修改用户状态
    int updateStatusByPrimaryKey(UserInfo userInfo);
    // 根据id查找用户的详细信息
    UserInfo selectOneTree(String id);
}