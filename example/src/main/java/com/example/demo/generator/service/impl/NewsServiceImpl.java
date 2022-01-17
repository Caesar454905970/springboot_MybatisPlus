package com.example.demo.generator.service.impl;

import com.example.demo.generator.entity.News;
import com.example.demo.generator.mapper.NewsMapper;
import com.example.demo.generator.service.INewsService;
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
public class NewsServiceImpl extends ServiceImpl<NewsMapper, News> implements INewsService {

}
