package com.itjm.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.itjm.constants.Const;
import com.itjm.domain.Message;
import com.itjm.domain.Order;
import com.itjm.domain.UserInfo;
import com.itjm.service.OrderService;
import com.itjm.service.UserService;
import com.itjm.utils.PageHelpers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.annotation.security.RolesAllowed;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 靳明
 * @Description: 用户
 * @date 2020/5/15  19:18
 */
@Controller
@RequestMapping("/user")
public class UserController {
    private static Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;
    @Autowired
    private OrderService orderService;

    /*
     * 功能描述: <br>
     * 〈登陆成功后跳转〉
     * @Param: [userInfo]
     * @Return: java.lang.String
     * @Author: 靳明
     * @Date: 2020/5/19 15:37
     */
    @RequestMapping("/login")
    public String userLogin(UserInfo userInfo){
        return "redirect:/admin/index?userName="+userInfo.getUserName();
    }


    /*
     * 功能描述: <br>
     * 〈添加用户〉
     * @Param: [userInfo, model]
     * @Return: java.lang.String
     * @Author: 靳明
     * @Date: 2020/5/19 15:37
     */
    @RequestMapping("/user_add")
    /*@PreAuthorize("authentication.principal.username='admin'")*/
    public String user_add(UserInfo userInfo,RedirectAttributes redirectAttributes){
        log.info(userInfo.toString());
        int i=userService.addUser(userInfo);
        Message msg=new Message();
        if (i==0){
            msg.setErrorMessage("添加失败");
        }else {
            msg.setSuccessMessage("添加成功");
        }
        redirectAttributes.addFlashAttribute("msg",msg);
        return "redirect:/admin/user_list?page=1";
    }

    /*
     * 功能描述: <br>
     * 〈修改用户〉
     * @Param: [userInfo, model]
     * @Return: java.lang.String
     * @Author: 靳明
     * @Date: 2020/5/19 18:24
     */
    @RequestMapping("/user_update")
    public String user_update(UserInfo userInfo, RedirectAttributes redirectAttributes){
        log.info("=================================================================");
        log.info(userInfo.toString());
        int i=userService.updateByPrimaryKey(userInfo);
        Message msg=new Message();
        if (i==0){
            msg.setErrorMessage("修改失败");
        }else {
            msg.setSuccessMessage("修改成功");
        }
        redirectAttributes.addFlashAttribute("msg",msg);
        return "redirect:/admin/user_list?page=1";
    }

    /*
     * 功能描述: <br>
     * 〈修改用户状态〉
     * @Param: [id, status]
     * @Return: java.util.Map<java.lang.String,java.lang.String>
     * @Author: 靳明
     * @Date: 2020/5/20 11:32
     */
    @RequestMapping("/user_updateStatus/{id}/{status}")
    @ResponseBody
    public Map<String,String> user_updateStatus(@PathVariable("id") String id, @PathVariable("status") int status){
        log.info("========================="+id+"==========================="+status);
        Map<String,String> map=new HashMap<>();
        UserInfo userInfo=new UserInfo();
        userInfo.setId(id);
        userInfo.setStatus(status);
        if (userService.updateStatusByPrimaryKey(userInfo)==0){
            map.put("success","false");
            map.put("msg",status==0?"禁用失败":"启用失败");
        }else {
            map.put("success","true");
            map.put("msg",status==0?"禁用成功":"启用成功");
        }

        return map;

    }


    /*
     * 功能描述: <br>
     * 〈删除用户〉
     * @Param: [id]
     * @Return: java.util.Map<java.lang.String,java.lang.String>
     * @Author: 靳明
     * @Date: 2020/5/20 11:50
     */
    @RequestMapping("/user_delete/{id}")
    @ResponseBody
    public Map<String,String> user_delete(@PathVariable("id") String id){
        Map<String,String> map=new HashMap<>();
        if (userService.deleteByPrimaryKey(id)==0){
            map.put("success","false");
            map.put("msg","删除失败");
        }else {
            map.put("success","true");
            map.put("msg","删除成功");
        }
        return map;

    }

    /*
     * 功能描述: <br>
     * 〈进入用户详情页〉
     * @Param: [id, model]
     * @Return: java.lang.String
     * @Author: 靳明
     * @Date: 2020/5/21 14:40
     */
    @RequestMapping("/user_selectDetails")
    //@RolesAllowed("USER,ADMIN") jsr注解实现
    //@Secured("ROLE_USER")  secured注解实现
    public String  user_selectDetails(@RequestParam("id") String id,Model model){
        ModelAndView mv=new ModelAndView();
        UserInfo userInfo=userService.selectDetailsByPrimaryKey(id);
        model.addAttribute("user",userInfo);
        return "user_details";
    }

    /*
    * [UserInfo{id='1', userName='admin', password='null', email='null', phoneNum='null', status=null, roleId=null, role=Role
    * {id='1', roleId=null, roleName='ADMIN', permissions=[Permissions{id='1', permissionName='用户登陆', url='/user/login'}]}},
    *  UserInfo{id='2', userName='admin', password='null', email='null', phoneNum='null', status=null, roleId=null,
    * role=Role{id='2', roleId=null, roleName='ADMIN', permissions=[Permissions{id='2', permissionName='用户列表', url='/admin/user_list'}]}}, UserInfo{id='3', userName='admin', password='null', email='null', phoneNum='null', status=null, roleId=null, role=Role{id='3', roleId=null, roleName='ADMIN', permissions=[Permissions{id='3', permissionName='用户修改', url='/user/user_update'}]}}]*/

    /*
     * 功能描述: <br>
     * 〈用户注册〉
     * @Param: [userInfo]
     * @Return: java.lang.String
     * @Author: 靳明
     * @Date: 2020/6/24 13:38
     */
    @RequestMapping("/register")
    public String  user_register(UserInfo userInfo,RedirectAttributes redirectAttributes){
        Message msg=new Message();
        if (userService.selectByUserName(userInfo.getUserName())==null) {
            userInfo.setStatus(1);
            userInfo.setRoleId(2);
            log.info(userInfo.toString());
            int i = userService.addUser(userInfo);
            if (i == 0) {
                msg.setErrorMessage("注册失败");
                redirectAttributes.addFlashAttribute("msg",msg);
                return "redirect:/admin/register";
            } else {
                msg.setSuccessMessage("注册成功");
                redirectAttributes.addFlashAttribute("msg",msg);
                return "redirect:index.jsp";
            }
        }else {
            msg.setErrorMessage("用户名已经注册");
            redirectAttributes.addFlashAttribute("msg",msg);
            return "redirect:/admin/register";
        }
    }


    /*
     * 功能描述: <br>
     * 〈修改密码〉
     * @Param: [userInfo, redirectAttributes]
     * @Return: java.lang.String
     * @Author: 靳明
     * @Date: 2020/6/25 11:38
     */
    @RequestMapping("/password_update")
    public String password_update(UserInfo userInfo, RedirectAttributes redirectAttributes){
        log.info(userInfo.toString());
        Message msg=new Message();
        if (userService.updateByPrimaryKey(userInfo)==0){
            msg.setErrorMessage("修改失败");
        }else {
            msg.setSuccessMessage("修改成功");
        }
        redirectAttributes.addFlashAttribute("msg",msg);
        return "redirect:/admin/main";
    }

    @RequestMapping("/user_order_list")
    public String userOrderList(@RequestParam("page") int pagecode,@RequestParam("userName") String userName, Model model){
        Page<?> page = PageHelper.startPage(pagecode, Const.PAGE_SIZE, true);
        List<Order> list = orderService.selectOrderByUserName(userName);
        int count = (int)page.getTotal();
        model.addAttribute("list", list);
        PageHelpers ph = new PageHelpers(list, count, pagecode, "admin/user_order_list");
        model.addAttribute("pages", ph);
        return "order_list";
    }
}


