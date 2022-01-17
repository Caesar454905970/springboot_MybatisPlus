package com.example.demo.generator.service.impl;

import com.example.demo.generator.entity.Orders;
import com.example.demo.generator.mapper.OrdersMapper;
import com.example.demo.generator.service.IOrdersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author demo
 * @since 2022-01-17
 */
@Service
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders> implements IOrdersService {

}
