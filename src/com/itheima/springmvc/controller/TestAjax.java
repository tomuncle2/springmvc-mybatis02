package com.itheima.springmvc.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itheima.springmvc.pojo.User;

@Controller
@RequestMapping("my")
public class TestAjax {

	@RequestMapping(value="myajax.action",method = RequestMethod.POST)
	@ResponseBody
	public  String testAjax(@RequestBody String data,HttpServletResponse re){
		
		System.out.println(data);
		String messageErr = "{\"error\":\"请求的记录不存在\"}";
		String messageSuc = "{\"success\":\"请求的记录存在\"}";
		
		/*  底层原理如下  但是可能会出现乱码问题
		 try {
			
			re.getWriter().write(messageErr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		return messageSuc;
	}
	
	@RequestMapping(value="pojoajax.action",method = RequestMethod.POST)
	@ResponseBody
	public  User pojoAjax(@RequestBody List<User> list,HttpServletResponse re){
		
		for(User u1:list){
			System.out.println(u1.toString());
		}
		String messageErr = "{\"error\":\"请求的记录不存在\"}";
		String messageSuc = "{\"success\":\"请求的记录存在\"}";
		
		/*  底层原理如下  但是可能会出现乱码问题
		 try {
			
			re.getWriter().write(messageErr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		User u  =new User();
		u.setAddress("湖南");u.setBirthday(new Date());u.setId(12345);u.setSex("男");u.setUsername("王杰");
		return u;
	}
	
	
	@RequestMapping(value="listpojoajax.action",method = RequestMethod.POST)
	@ResponseBody
	public List<User> listPojoAjax(@RequestBody List<User> list,HttpServletResponse re){
		
		for(User u1:list){
			System.out.println(u1.toString());
		}
		String messageErr = "{\"error\":\"请求的记录不存在\"}";
		String messageSuc = "{\"success\":\"请求的记录存在\"}";
		
		/*  底层原理如下  但是可能会出现乱码问题
		 try {
			
			re.getWriter().write(messageErr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		User u  =new User();User u2 = new User();
		u.setAddress("湖南");u.setBirthday(new Date());u.setId(12345);u.setSex("男");u.setUsername("王杰");
		u2.setAddress("湖北");u2.setBirthday(new Date());u2.setId(23456);u2.setSex("男");u2.setUsername("王一");
		List<User> li = new ArrayList<User>();li.add(u);li.add(u2);
		return li;
	}
	
	
	@RequestMapping(value="datelistpojoajax.action",method = RequestMethod.POST)
	@ResponseBody
	public List<User> datelistPojoAjax(  Date birthday ,HttpServletResponse re){
		
		
			System.out.println(birthday.toString());
		
		String messageErr = "{\"error\":\"请求的记录不存在\"}";
		String messageSuc = "{\"success\":\"请求的记录存在\"}";
		
		/*  底层原理如下  但是可能会出现乱码问题
		 try {
			
			re.getWriter().write(messageErr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		User u  =new User();User u2 = new User();
		u.setAddress("湖南");u.setBirthday(new Date());u.setId(12345);u.setSex("男");u.setUsername("王杰");
		u2.setAddress("湖北");u2.setBirthday(new Date());u2.setId(23456);u2.setSex("男");u2.setUsername("王一");
		List<User> li = new ArrayList<User>();li.add(u);li.add(u2);
		return li;
	}
}
