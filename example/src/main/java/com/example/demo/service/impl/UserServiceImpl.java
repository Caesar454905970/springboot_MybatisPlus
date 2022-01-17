package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.domain.Orders;
import com.example.demo.domain.User;
import com.example.demo.mapper.OrdersMapper;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService {

    @Autowired
    private OrdersMapper ordersMapper;


    @Override
    public User test() {
        //查询2个表
        UserMapper userMapper = getBaseMapper();
        List<Orders> orders = ordersMapper.selectList(null);
        User user = userMapper.selectById(3);
        //查询用户对应的订单
        QueryWrapper<Orders> Wrapper =new QueryWrapper<Orders>();
        Wrapper.eq("user_id",3);
        ordersMapper.selectList(Wrapper);
        return user;
    }
}

