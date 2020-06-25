package com.itjm.service;

import com.itjm.domain.Order;

import java.util.List;

/**
 * @author 靳明
 * @Description: 订单方法类
 * @date 2020/5/15  19:20
 */
public interface OrderService {
    //添加订单
    public int addOrder(Order order);
    //查询某个用户的订单
    public List<Order> selectOrderByUserName(String userName);
    //根据id查询订单
    public Order selectOrderByPrimaryKey(String id);
    //修改订单信息
    public int updateOrder(Order order);
    //删除订单信息
    public int deleteOrder(String id);
}
