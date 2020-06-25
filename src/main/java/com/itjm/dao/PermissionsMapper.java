package com.itjm.dao;

import com.itjm.domain.Permissions;

import java.util.List;

public interface PermissionsMapper {
    int deleteByPrimaryKey(String id);

    int insert(Permissions record);

    int insertSelective(Permissions record);

    Permissions selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Permissions record);

    int updateByPrimaryKey(Permissions record);

    List<Permissions> selectByRoleId(int roleId);
}