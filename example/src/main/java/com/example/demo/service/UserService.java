package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.domain.User;

import java.util.List;

public interface UserService extends IService<User> {
    User test();
}
