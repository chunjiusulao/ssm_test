package com.itjm.service;

import com.itjm.domain.Role;

import java.util.List;

/**
 * @author 靳明
 * @Description: 角色方法类
 * @date 2020/5/15  18:20
 */
public interface RoleService {
    //添加角色
    public int addRole(Role role);
    //角色列表
    public List<Role> selectAll();
}
