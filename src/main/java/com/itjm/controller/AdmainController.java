package com.itjm.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.itjm.constants.Const;
import com.itjm.domain.*;
import com.itjm.service.*;
import com.itjm.utils.DateUtils;
import com.itjm.utils.OtherUtils;
import com.itjm.utils.PageHelpers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author 靳明
 * @Description:菜单
 * @date 2020/5/12  13:39
 */
@Controller
@RequestMapping("/admin")
public class AdmainController {
    private static Logger log = LoggerFactory.getLogger(AdmainController.class);

    @Autowired
    private ProductService productService;
    @Autowired
    private RoleService roleService;
    @Autowired
    private OrderService orderService;
    @Autowired
    private UserService userService;
    @Autowired
    private LogService logService;

    @RequestMapping("/menu")
    public String menuPage() {
        return "menu";
    }
    /**
     * 顶部页面
     * @return
     *liuyang
     *2018-01-17 18:35:42
     */
    @RequestMapping("/top")
    public String topPage(@RequestParam("userName") String userName, Model model) {
        model.addAttribute("userName",userName);
        return "top";
    }

    /**
     * 右侧页面
     * @return
     *liuyang
     *2018-01-17 18:39:44
     */
    @RequestMapping("/main")
    public String mainPage() {
        return "main";
    }

    /**
     * 进入系统管理主界面
     * @return
     * chengxinhui
     *2018-01-17 18:20:59
     */
    @RequestMapping("/index")
    public String loginIndex(@RequestParam("userName") String userName, Model model) {
        log.info("=========================================="+userName);
        model.addAttribute("userName",userName);
        return "index";
    }

    @RequestMapping("/logout")
    public String logout() {
        return "login";
    }


    /*
     * 功能描述: <br>
     * 〈校验失败页面〉
     * @Param: []
     * @Return: java.lang.String
     * @Author: 靳明
     * @Date: 2020/5/18 21:24
     */
    @RequestMapping("/failer")
    public String loginFailer(){return "failer";}

    /*
     * 功能描述: <br>
     * 〈进入产品界面〉
     * @Param: [pagecode, model]
     * @Return: java.lang.String
     * @Author: 靳明
     * @Date: 2020/5/13 10:55
     */
    @RequestMapping("/product_list")
    public String productListPage(@RequestParam("page") int pagecode, Model model){
        Page<?> page = PageHelper.startPage(pagecode, Const.PAGE_SIZE, true);
        List<Product> list = productService.selectAll();
        int count = (int)page.getTotal();
        model.addAttribute("list", list);
        PageHelpers ph = new PageHelpers(list, count, pagecode, "admin/product_list");
        model.addAttribute("pages", ph);
        return "product_list";
    }

    /*
     * 功能描述: <br>
     * 〈进入已审核产品界面〉
     * @Param: [pagecode, model]
     * @Return: java.lang.String
     * @Author: 靳明
     * @Date: 2020/5/13 10:55
     */
    @RequestMapping("/product_inspect_list")
    public String productInspectListPage(@RequestParam("page") int pagecode, Model model){
        Page<?> page = PageHelper.startPage(pagecode, Const.PAGE_SIZE, true);
        List<Product> list = productService.selectInspectAll();
        int count = (int)page.getTotal();
        model.addAttribute("list", list);
        PageHelpers ph = new PageHelpers(list, count, pagecode, "admin/product_list");
        model.addAttribute("pages", ph);
        return "product_inspect_list";
    }


    /*
     * 功能描述: <br>
     * 〈进入产品添加界面〉
     * @Param: []
     * @Return: java.lang.String
     * @Author: 靳明
     * @Date: 2020/5/16 11:31
     */
    @RequestMapping("/product_add")
    public String productAdd(){
        return "product_add";
    }

    /*
     * 功能描述: <br>
     * 〈进入产品修改页面〉
     * @Param: [id, model]
     * @Return: java.lang.String
     * @Author: 靳明
     * @Date: 2020/5/19 15:42
     */
    @RequestMapping("/product_update")
    public String productUpdate(@RequestParam("id") String id,Model model){
        Product product=new Product();
        product=productService.selectByPrimaryKey(id);
        product.setDepartureTimeStr(DateUtils.date2String(product.getDepartureTime(),"yyyy-MM-dd HH:mm:ss"));
        model.addAttribute("product",product);
        return "product_update";
    }


    /*
     * 功能描述: <br>
     * 〈进入用户添加界面〉
     * @Param: []
     * @Return: java.lang.String
     * @Author: 靳明
     * @Date: 2020/5/19 15:43
     */
    @RequestMapping("/user_add")
    public String userAdd(){
        return "user_add";
    }

    /*
     * 功能描述: <br>
     * 〈进入用户列表界面〉
     * @Param: [pagecode, model]
     * @Return: java.lang.String
     * @Author: 靳明
     * @Date: 2020/5/19 15:45
     */
    @RequestMapping("/user_list")
    public String userListPage(@RequestParam("page") int pagecode, Model model){
        Page<?> page = PageHelper.startPage(pagecode, Const.PAGE_SIZE, true);
        List<UserInfo> list = userService.selectAll();
        int count = (int)page.getTotal();
        model.addAttribute("list", list);
        PageHelpers ph = new PageHelpers(list, count, pagecode, "admin/user_list");
        model.addAttribute("pages", ph);
        return "user_list";
    }

    /*
     * 功能描述: <br>
     * 〈进入用户修改界面〉
     * @Param: [id, model]
     * @Return: java.lang.String
     * @Author: 靳明
     * @Date: 2020/6/13 9:10
     */
    @RequestMapping("/user_update")
    public String user_update(@RequestParam("id") String id, Model model){
        UserInfo userInfo=new UserInfo();
        userInfo=userService.selectByPrimeryKey(id);
        model.addAttribute("userInfo",userInfo);
        return "user_update";
    }

    /*
     * 功能描述: <br>
     * 〈进入角色列表〉
     * @Param:
     * @Return:
     * @Author: 靳明
     * @Date: 2020/6/13 9:10
     */
    @RequestMapping("/role_list")
    public String roleList(@RequestParam("page") int pagecode, Model model){
        Page<?> page = PageHelper.startPage(pagecode, Const.PAGE_SIZE, true);
        List<Role> list = roleService.selectAll();
        System.out.println(list.get(0));
        int count = (int)page.getTotal();
        model.addAttribute("list", list);
        PageHelpers ph = new PageHelpers(list, count, pagecode, "admin/role_list");
        model.addAttribute("pages", ph);
        return "role_list";
    }

    /*
     * 功能描述: <br>
     * 〈进入登陆界面〉
     * @Param: []
     * @Return: java.lang.String
     * @Author: 靳明
     * @Date: 2020/6/13 9:10
     */
    @RequestMapping("/login")
    public String userLogin(){
        return "login";
    }


    /*
     * 功能描述: <br>
     * 〈进入注册界面〉
     * @Param: []
     * @Return: java.lang.String
     * @Author: 靳明
     * @Date: 2020/6/24 13:41
     */
    @RequestMapping("/register")
    public String userRegister(){
        return "register";
    }

    /*
     * 功能描述: <br>
     * 〈进入下单界面〉
     * @Param: [id, productName, price, model]
     * @Return: java.lang.String
     * @Author: 靳明
     * @Date: 2020/6/24 20:26
     */
    @RequestMapping("/order_add")
    public String orderAdd(@RequestParam("id") String id,@RequestParam("productName") String productName,@RequestParam("price") String price,Model model){
        Order order=new Order();
        order.setProductId(id);
        BigDecimal bigDecimal = new BigDecimal(price);
        order.setOneMoney(bigDecimal);
        order.setProductName(productName);
        log.info(order.getProductName());
        model.addAttribute("order",order);
        return "order_add";
    }


    /*
     * 功能描述: <br>
     * 〈进入订单列表页面〉
     * @Param: [pagecode, model]
     * @Return: java.lang.String
     * @Author: 靳明
     * @Date: 2020/6/24 22:06
     */
    @RequestMapping("/order_list")
    public String orderListPage(@RequestParam("page") int pagecode, Model model){
        Page<?> page = PageHelper.startPage(pagecode, Const.PAGE_SIZE, true);
        List<Order> list =orderService.selectOrderByUserName(OtherUtils.getUsername());
        for (Order order : list) {
            order.setOneMoney(BigDecimal.valueOf(order.getMoney().doubleValue()/order.getCount()));
        }
        int count = (int)page.getTotal();
        model.addAttribute("list", list);
        PageHelpers ph = new PageHelpers(list, count, pagecode, "admin/order_list");
        model.addAttribute("pages", ph);
        return "order_list";
    }

    /*
     * 功能描述: <br>
     * 〈进入订单修改页面〉
     * @Param: [id, model]
     * @Return: java.lang.String
     * @Author: 靳明
     * @Date: 2020/6/24 22:23
     */
    @RequestMapping("/order_update")
    public String orderUpdate(@RequestParam("id") String id, Model model){
        Order order = orderService.selectOrderByPrimaryKey(id);
        order.setOneMoney(BigDecimal.valueOf(order.getMoney().doubleValue()/order.getCount()));
        log.info(BigDecimal.valueOf(order.getMoney().doubleValue()/order.getCount()).toString());
        model.addAttribute("order",order);
        return "order_update";
    }


    /*
     * 功能描述: <br>
     * 〈进入用户修改自己信息页面〉
     * @Param: [userName, model]
     * @Return: java.lang.String
     * @Author: 靳明
     * @Date: 2020/6/24 22:51
     */
    @RequestMapping("/password_update")
    public String passwordUpdate(@RequestParam("userName") String userName, Model model){
        UserInfo userInfo=new UserInfo();
        userInfo=userService.selectByUserName(userName);
        model.addAttribute("userInfo",userInfo);
        return "password_update";
    }

    /*
     * 功能描述: <br>
     * 〈日志列表〉
     * @Param: [pagecode, model]
     * @Return: java.lang.String
     * @Author: 靳明
     * @Date: 2020/6/25 11:34
     */
    @RequestMapping("/log_list")
    public String logList(@RequestParam("page") int pagecode,Model model){
        Page<?> page = PageHelper.startPage(pagecode, Const.PAGE_SIZE, true);
        List<Log> list=logService.selectLog();
        int count = (int)page.getTotal();
        model.addAttribute("list",list);
        PageHelpers ph = new PageHelpers(list, count, pagecode, "admin/log_list");
        model.addAttribute("pages", ph);
        return "log_list";
    }


}
