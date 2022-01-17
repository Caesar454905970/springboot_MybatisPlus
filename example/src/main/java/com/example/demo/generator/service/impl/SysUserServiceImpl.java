package com.example.demo.generator.service.impl;

import com.example.demo.generator.entity.SysUser;
import com.example.demo.generator.mapper.SysUserMapper;
import com.example.demo.generator.service.ISysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author demo
 * @since 2022-01-17
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

}
