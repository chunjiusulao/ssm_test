package com.itjm.service.impl;

import com.itjm.dao.RoleMapper;
import com.itjm.domain.Role;
import com.itjm.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 靳明
 * @Description: 角色方法实现类
 * @date 2020/5/15  18:20
 */
@Service("roleService")
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleMapper roleMapper;

    @Override
    public int addRole(Role role) {
        return roleMapper.insert(role);
    }

    @Override
    public List<Role> selectAll() {
        return roleMapper.selectAll();
    }
}
