package com.example.demo.generator.service.impl;

import com.example.demo.generator.entity.Book;
import com.example.demo.generator.mapper.BookMapper;
import com.example.demo.generator.service.IBookService;
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
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements IBookService {

}
