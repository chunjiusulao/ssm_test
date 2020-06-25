package com.itjm.dao;

import com.itjm.domain.Role;

import java.util.List;


public interface RoleMapper {

    List<Role> selectAll();

    int deleteByPrimaryKey(String id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

    Role selectByRoleId(int id);
}