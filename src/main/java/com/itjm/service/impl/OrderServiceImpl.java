package com.itjm.service.impl;

import com.itjm.dao.OrderMapper;
import com.itjm.domain.Order;
import com.itjm.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 靳明
 * @Description: 订单方法实现类
 * @date 2020/5/15  19:20
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService {
    @Autowired
    public OrderMapper orderMapper;

    @Override
    public int addOrder(Order order) {
        int i= orderMapper.insert(order);
        return i;
    }


    @Override
    public List<Order> selectOrderByUserName(String userName) {
        List<Order> orders = orderMapper.selectByUserName(userName);
        return orders;
    }

    @Override
    public Order selectOrderByPrimaryKey(String id) {
        Order order = orderMapper.selectByPrimaryKey(id);
        return order;
    }

    @Override
    public int updateOrder(Order order) {
        int i = orderMapper.updateByPrimaryKeySelective(order);
        return i;
    }

    @Override
    public int deleteOrder(String id) {
        int i = orderMapper.deleteByPrimaryKey(id);
        return i;
    }
}
