package com.itjm.service.impl;

import com.itjm.controller.ProductController;
import com.itjm.dao.PermissionsMapper;
import com.itjm.dao.RoleMapper;
import com.itjm.dao.UserMapper;
import com.itjm.domain.Role;
import com.itjm.domain.UserInfo;
import com.itjm.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author 靳明
 * @Description: 用户方法实现类
 * @date 2020/5/15  19:17
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
    private static Logger log = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private PermissionsMapper permissionsMapper;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    /**
     * Locates the user based on the username. In the actual implementation, the search
     * may possibly be case sensitive, or case insensitive depending on how the
     * implementation instance is configured. In this case, the <code>UserDetails</code>
     * object that comes back may have a username that is of a different case than what
     * was actually requested..
     *
     * @param username the username identifying the user whose data is required.
     * @return a fully populated user record (never <code>null</code>)
     * @throws UsernameNotFoundException if the user could not be found or the user has no
     *                                   GrantedAuthority
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserInfo userinfo=userMapper.selectByUserName(username);
        log.info(userinfo.toString());
            //处理自己的用户对象，封装成UserDetails
            //User user=new User(userinfo.getUserName(),"{noop}"+userinfo.getPassword(), Collections.singleton(getAuthority(userinfo.getRoleId())));
            User user = new User(userinfo.getUserName(), userinfo.getPassword(), userinfo.getStatus() == 0 ? false : true,
                    true, true, true, getAuthority(userinfo.getRoleId())
            );
            return user;

    }


    /*
     * 功能描述: <br>
     * 〈用户权限角色〉
     * @Param: [id]
     * @Return: java.util.List<org.springframework.security.core.authority.SimpleGrantedAuthority>
     * @Author: 靳明
     * @Date: 2020/5/20 10:16
     */
    public List<SimpleGrantedAuthority> getAuthority(int id){
        Role role=roleMapper.selectByRoleId(id);
        List<SimpleGrantedAuthority> list=new ArrayList<>();
        log.info(role.getRoleName().toUpperCase());
        list.add(new SimpleGrantedAuthority("ROLE_"+role.getRoleName().toUpperCase()));
        return list;
    }


    /*
     * 功能描述: <br>
     * 〈查询所有用户〉
     * @Param: []
     * @Return: java.util.List<com.itjm.domain.UserInfo>
     * @Author: 靳明
     * @Date: 2020/5/19 15:32
     */
    @Override
    public List<UserInfo> selectAll() {
        List<UserInfo> list=new ArrayList<>();
        list=userMapper.selectAll();
        return list;
    }

    /*
     * 功能描述: <br>
     * 〈添加用户方法〉
     * @Param: [userInfo]
     * @Return: int
     * @Author: 靳明
     * @Date: 2020/5/19 15:33
     */
    @Override
    public int addUser(UserInfo userInfo) {
        String uuid= UUID.randomUUID().toString();
        userInfo.setId(uuid);
        userInfo.setPassword(bCryptPasswordEncoder.encode(userInfo.getPassword()));
        int i=userMapper.insert(userInfo);
        return i;
    }

    /*
     * 功能描述: <br>
     * 〈根据id查询用户〉
     * @Param: [id]
     * @Return: com.itjm.domain.UserInfo
     * @Author: 靳明
     * @Date: 2020/5/19 18:11
     */
    @Override
    public UserInfo selectByPrimeryKey(String id) {
        UserInfo userInfo=userMapper.selectByPrimaryKey(id);
        return userInfo;
    }

    @Override
    public UserInfo selectByUserName(String userName) {
        UserInfo userInfo=userMapper.selectByUserName(userName);
        return userInfo;
    }

    /*
     * 功能描述: <br>
     * 〈修改用户〉
     * @Param: [userInfo]
     * @Return: int
     * @Author: 靳明
     * @Date: 2020/5/19 18:22
     */
    @Override
    public int updateByPrimaryKey(UserInfo userInfo) {
        userInfo.setPassword(bCryptPasswordEncoder.encode(userInfo.getPassword()));
       int i= userMapper.updateByPrimaryKeySelective(userInfo);
        return i;
    }

    /*
     * 功能描述: <br>
     * 〈修改用户状态〉
     * @Param: [userInfo]
     * @Return: int
     * @Author: 靳明
     * @Date: 2020/5/20 11:31
     */
    @Override
    public int updateStatusByPrimaryKey(UserInfo userInfo) {
        int i = userMapper.updateStatusByPrimaryKey(userInfo);
        return i;
    }

    /*
     * 功能描述: <br>
     * 〈删除用户〉
     * @Param: [id]
     * @Return: int
     * @Author: 靳明
     * @Date: 2020/5/20 11:31
     */
    @Override
    public int deleteByPrimaryKey(String id) {
        int i=userMapper.deleteByPrimaryKey(id);
        return i;
    }

    @Override
    public UserInfo selectDetailsByPrimaryKey(String id) {
        UserInfo userInfo=userMapper.selectOneTree(id);
        Role role=roleMapper.selectByRoleId(userInfo.getRoleId());
        role.setPermissions(permissionsMapper.selectByRoleId(role.getRoleId()));
        userInfo.setRole(role);
        return userInfo;
    }


}
