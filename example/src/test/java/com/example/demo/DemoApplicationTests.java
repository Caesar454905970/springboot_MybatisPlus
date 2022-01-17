package com.example.demo;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.TableFieldInfo;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.domain.Orders;
import com.example.demo.domain.User;
import com.example.demo.mapper.OrdersMapper;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.function.Predicate;

@SpringBootTest
@MapperScan("com.example.demo.mapper")
public class DemoApplicationTests {




	@Autowired
	private UserMapper userMapper;

	@Test
	public void testQueryList(){
		 List<User> users=userMapper.selectList(null);
		System.out.println(users);
	}


	@Test
	public void testInsert(){
	User user =new User();
	user.setUserName("111");
	user.setPassword("222");
	int r = userMapper.insert(user);
	System.out.println(r);
	}

	@Test
	public void testWrapper01(){
		QueryWrapper wapper = new QueryWrapper();
		wapper.gt("age",18);
		wapper.eq("address","狐山");
		List<User> users=userMapper.selectList(wapper);
		System.out.println(users);
	}

	@Test
	public void testWrapper02(){
		QueryWrapper<User> wapper =new QueryWrapper<>();
		wapper.in("id",1,2,3);
		wapper.between("age",12,29);
		wapper.like("address","山");
		List<User> users=userMapper.selectList(wapper);
		System.out.println(users);



	}
	@Test
	public void testWrapper03(){
		QueryWrapper<User> wapper =new QueryWrapper<>();
		wapper.in("id",1,2,3);
		wapper.gt("age",10);
		wapper.orderByDesc("age");
		List<User> users = userMapper.selectList(wapper);
		System.out.println(users);

	}


	@Test
	public void testWrapper04(){
		QueryWrapper<User> wapper =new QueryWrapper<>();
		wapper.select("id","user_name");
		List<User> users=userMapper.selectList(wapper);
		System.out.println(users);
	}

	@Test
	public void testSelect03(){
		QueryWrapper<User> queryWrapper = new QueryWrapper<>(new User());
		queryWrapper.select(new Predicate<TableFieldInfo>() {
			@Override
			public boolean test(TableFieldInfo tableFieldInfo) {
				return !"address".equals(tableFieldInfo.getColumn());
			}
		});
		List<User> users = userMapper.selectList(queryWrapper);
		System.out.println(users);
	}

	@Test
	public void testUpdateWrapper(){
		UpdateWrapper<User> updateWrapper = new UpdateWrapper<>();
		updateWrapper.gt("id",1);
		updateWrapper.set("age",99);
		userMapper.update(null,updateWrapper);
	}

	@Test
	public void testLambdaWrapper2(){
		LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
		queryWrapper.gt(User::getAge,18);
		queryWrapper.eq(User::getAddress,"狐山");
		List<User> users = userMapper.selectList(queryWrapper);
		System.out.println(users);


		
	}
	
	@Test
	public void testMythod(){
		User myUser = userMapper.findMyUser(1L);
		System.out.println(myUser);
	}

	@Test
	public void testMythod1(){
		QueryWrapper wrapper = new QueryWrapper();
		wrapper.eq("id",4);
		wrapper.eq("address","狐山");
		User myUser = userMapper.findMyUserByWrapper(wrapper);
		System.out.println(myUser);
	}


	@Test
	public void testPage(){
		Page<User> page=new Page<>();
		//设置每页条数
		page.setSize(2);
		//设置查询第几页
		page.setCurrent(1);
		userMapper.selectPage(page,null);
		System.out.println(page.getRecords()); //获取当前页的数据
		System.out.println(page.getTotal());//获取总记录
		System.out.println(page.getCurrent());//当前页码
	}



	@Autowired
	private UserService userService;


	@Test
	public void testService(){
		List<User> list = userService.list();
		System.out.println(list);
	}



















	@Autowired
	private OrdersMapper ordersMapper;
	@Test
	public void TestOrderPages(){
		Page<Orders> page =new Page<>();
		//设置每页大小
		page.setSize(2);
		//设置当前页码
		page.setCurrent(2);
		 ordersMapper.findAllOrders(page);
		System.out.println(page.getRecords());
		System.out.println(page.getTotal());
	}

//	@Autowired
//	private UserService userService;
//
//	@Test
//	public void testService(){
//		List<User> list = userService.list();
//		System.out.println(list);
//	}




}
