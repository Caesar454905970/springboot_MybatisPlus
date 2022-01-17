package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.domain.Orders;

import java.util.List;

public interface OrdersMapper extends BaseMapper<Orders> {

    IPage<Orders> findAllOrders(Page<Orders> page);
}
