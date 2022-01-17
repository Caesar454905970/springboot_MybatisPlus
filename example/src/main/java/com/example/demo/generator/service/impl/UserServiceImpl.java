package com.example.demo.generator.service.impl;

import com.example.demo.generator.entity.User;
import com.example.demo.generator.mapper.UserMapper;
import com.example.demo.generator.service.IUserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
