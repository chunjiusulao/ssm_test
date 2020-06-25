package com.itjm.controller;

import com.itjm.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 靳明
 * @Description: 角色
 * @date 2020/5/15  19:21
 */
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @RequestMapping("/permission_assign")
    public String permission_assign(){
        return "";
    }

    @RequestMapping("role_update")
    public String role_update(){
        return "";
    }

    @RequestMapping("role_delete")
    public Map<String,String> role_delete(){
        Map<String,String> map=new HashMap<>();
        return map;
    }
}
