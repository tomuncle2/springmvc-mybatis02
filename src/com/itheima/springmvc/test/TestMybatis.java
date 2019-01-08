package com.itheima.springmvc.test;


import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.itheima.springmvc.dao.MyUserMapper;
import com.itheima.springmvc.pojo.MyOrder;
import com.itheima.springmvc.pojo.MyQueryVo;
import com.itheima.springmvc.pojo.MyUser;
import com.itheima.springmvc.pojo.Order;
import com.itheima.springmvc.pojo.OrderUser;
import com.itheima.springmvc.pojo.User;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:springmvc.xml"}) 
//@ContextConfiguration({"classpath:applicationContext.xml","classpath:springmvc.xml"}) 
public class TestMybatis {
	
	@Autowired
	MyUserMapper m;
	/*
	@Test
	public void test1(){
		List<User> li = m.getList("张");
		System.out.println(li);
	}
	
	
	@Test
	public void test2(){
		User li = m.getUserById(1);
		System.out.println(li);
	}
	
	
	@Test
	public void test3(){
		User li = new User();
		li.setAddress("东京爱情故事");li.setId(100);li.setUsername("大熊");li.setBirthday(new Date());li.setSex("男");;
		int number = m.save(li);
		System.out.println(number);
	}
	
	@Test
	public void test4(){
		User l3 = new User();
		l3.setAddress("东京爱情故事");l3.setUsername("大熊");l3.setBirthday(new Date());l3.setSex("男");;
		int id = m.saveReturnId(l3);
		System.out.println(id);
	}*/
	
	
	@Test
	public void test5(){
		User l3 = new User();User l4 = new User();
		l3.setAddress("东京爱情故事");l3.setUsername("大熊");l3.setBirthday(new Date());l3.setSex("2");
		l4.setAddress("东京爱情故事");l4.setUsername("大y熊");l4.setBirthday(new Date());l4.setSex("1");
		List<User> listUser = new ArrayList<User>();
		listUser.add(l3);listUser.add(l4);
		int id = m.saves(listUser);
		System.out.println(id);
	}
	
	@Test
	public void test6(){
		MyQueryVo vo = new MyQueryVo();
		User l3 = new User();User l4 = new User();
		l3.setAddress("东京爱情故事");l3.setUsername("熊本");l3.setBirthday(new Date());l3.setSex("2");
		vo.setUser(l3);
		List<User> list = m.getListByVo(vo);
		System.out.println(list);
	}
	
	
	@Test
	public void test7(){
		long l =m.totalUser();
		System.out.println(l);
	}
	
	//resultMap自定义封装
	@Test
	public void test8(){
		List<Order> li=m.getOrderList();
		System.out.println(li);
	}
	
	//resultMap自定义封装   改造pojo  OrderUser继承Order类，设置user属性
	@Test
	public void test9(){
		List<OrderUser> li=m.queryOrderUser();
		System.out.println(li);
	}
	
	
	//resultMap自定义封装  改造pojo  Order里面包含User   一对一
		@Test
		public void test10(){
			List<Order> li=m.getOrderUserList();
			System.out.println(li);
		}
		
		//一对多查询
		@Test
		public void test11(){
		List<MyUser> list = m.queryMyUserMyOrder();
			System.out.println(list);
		}
		
		@Test
		public void test12(){
			User u =new User();u.setUsername("张");
		List<User> li = m.queryWhereUser(u);
			System.out.println(li);
		}
		
		@Test
		public void test13(){
			Map<String,Object> maps = new HashMap<String,Object>();
			maps.put("username","熊");
		List<User> li = m.queryByMap(maps);
			System.out.println(li.size());
		}
		
		
		@Test
		public void test14(){
			Map<String,Object> maps = new HashMap<String,Object>();
			maps.put("name","熊");maps.put("sex","男");//maps.put("id",10);当key id value不存在时xml的if id!=null and id!=''可以智能判断
		List<User> li = m.queryByMaps(maps);
			System.out.println(li.size());
		}
		
		
		@Test
		public void test15(){
			Map<String,Object> maps = new HashMap<String,Object>();
			//maps.put("username","张");
			//maps.put("sex","男");
			//maps.put("id",10);//当key id value不存在时xml的if id!=null and id!=''可以智能判断
		List<User> li = m.queryChoose(maps);
			System.out.println(li);
		}
		
		
		@Test
		public void test16(){
			Map<String,Object> maps = new HashMap<String,Object>();
			maps.put("username","熊本");
			//maps.put("sex","男");
			maps.put("birthday","1994-07-16");//当key id value不存在时xml的if id!=null and id!=''可以智能判断
		int li = m.updateUsers(maps);
			System.out.println(li);
		}
		
		
		@Test
		public void test17(){
			Map<String,Object> maps = new HashMap<String,Object>();
			maps.put("username","熊本");
			//maps.put("sex","男");
			maps.put("birthday","1994-07-16");//当key id value不存在时xml的if id!=null and id!=''可以智能判断
		int li = m.updateUserTrim(maps);
			System.out.println(li);
		}
		
}