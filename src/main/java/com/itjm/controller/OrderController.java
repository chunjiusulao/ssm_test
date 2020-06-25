package com.itjm.controller;

import com.itjm.domain.Message;
import com.itjm.domain.Order;
import com.itjm.service.OrderService;
import com.itjm.utils.OtherUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @author 靳明
 * @Description: 订单
 * @date 2020/5/15  19:20
 */
@Controller
@RequestMapping("/order")
public class OrderController {
    private static Logger logger= LoggerFactory.getLogger(OrderController.class);

    @Autowired
    private OrderService orderService;

    /*
     * 功能描述: <br>
     * 〈下单完成〉
     * @Param: [order, redirectAttributes]
     * @Return: java.lang.String
     * @Author: 靳明
     * @Date: 2020/6/24 20:51
     */
    @RequestMapping("/addOrder")
    public String addOrder(Order order, RedirectAttributes redirectAttributes){
        Message msg=new Message();
        String username = OtherUtils.getUsername();//利用工具类找到下单用户
        order.setUserName(username);
        Date date=new Date();//现在的下单时间
        order.setOrderTime(date);
        order.setId(UUID.randomUUID().toString());//uuid生成id与订单id
        order.setOrderNum(UUID.randomUUID().toString());
        double money = order.getOneMoney().doubleValue();
        money*=order.getCount();
        order.setMoney(BigDecimal.valueOf(money));
        order.setOrderStatus(1);
        if (orderService.addOrder(order)!=0){
            msg.setSuccessMessage("添加成功");
        }else {
            msg.setErrorMessage("添加失败");
        }
        redirectAttributes.addFlashAttribute("msg",msg);
        return "redirect:/admin/order_list?page=1";
    }

    /*
     * 功能描述: <br>
     * 〈修改订单〉
     * @Param: [order, redirectAttributes]
     * @Return: java.lang.String
     * @Author: 靳明
     * @Date: 2020/6/24 22:23
     */
    @RequestMapping("/updateOrder")
    public String updateOrder(Order order, RedirectAttributes redirectAttributes){
        Message msg=new Message();
        order.setMoney(BigDecimal.valueOf(order.getOneMoney().doubleValue()*order.getCount()));
        if (orderService.updateOrder(order)!=0){
            msg.setSuccessMessage("修改成功");
        }else {
            msg.setErrorMessage("修改失败");
        }
        redirectAttributes.addFlashAttribute("msg",msg);
        return "redirect:/admin/order_list?page=1";
    }



    /*
     * 功能描述: <br>
     * 〈删除订单〉
     * @Param: [id]
     * @Return: java.util.Map<java.lang.String,java.lang.String>
     * @Author: 靳明
     * @Date: 2020/6/24 22:41
     */
    @RequestMapping("/deleteOrderByPrimaryKey/{id}")
    @ResponseBody
    public Map<String,String> deleteOrderByPrimaryKey(@PathVariable("id") String id){
        Map<String,String> map=new HashMap<String, String>();
        if (orderService.deleteOrder(id)!=0){
            map.put("success","true");
            map.put("msg","删除成功");
        }else {
            map.put("success","false");
            map.put("msg","删除失败");
        }
        return map;
    }
}
