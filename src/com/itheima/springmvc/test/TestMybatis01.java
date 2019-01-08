package com.itheima.springmvc.test;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.itheima.springmvc.pojo.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:springmvc.xml"}) 
public class TestMybatis01 {

	@Autowired
	private  SqlSessionFactoryBean sqlSessionFactoryBean;
	

	public  SqlSession getsqlSession(){
		SqlSessionFactory sqlSessionFactory= null;
		try {
			sqlSessionFactory = sqlSessionFactoryBean.getObject();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SqlSession sqlSession = sqlSessionFactory.openSession();
		return sqlSession;
		
	}
	
	
	@Test
	public void test01(){
		SqlSession sqlSession = this.getsqlSession();
		User u = (User)sqlSession.selectOne("com.itheima.springmvc.dao.MyUserMapper.getUserById",1);
		List<User> li = sqlSession.selectList("com.itheima.springmvc.dao.MyUserMapper.getList","王");
		System.out.println(u);System.out.println(li);
		sqlSession.close();
	}
	
	
	@Test
	public void test02(){
		SqlSession sqlSession = this.getsqlSession();
		User l3 = new User();
		l3.setAddress("东京爱情故事");l3.setId(210);l3.setUsername("大熊");l3.setBirthday(new Date());l3.setSex("男");;
		int n = sqlSession.update("com.itheima.springmvc.dao.MyUserMapper.saveReturnId", l3);
		System.out.println(n);
		sqlSession.close();
	}
	
	
}
