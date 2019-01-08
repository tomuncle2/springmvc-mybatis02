package com.itheima.springmvc.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.itheima.springmvc.pojo.MyQueryVo;
import com.itheima.springmvc.pojo.MyUser;
import com.itheima.springmvc.pojo.Order;
import com.itheima.springmvc.pojo.OrderUser;
import com.itheima.springmvc.pojo.User;

public interface MyUserMapper {
	
	//模糊查询结果
	public List<User> getList(String name);
	
	public User getUserById(int id);
	
	//返回增加的记录数目
	public int save(User user);
	
	//返回增加的记录的主键
	public int saves(@Param("listUser") List<User> listUser);
	
	public int saveReturnId(User user);
	
	public List<User> getListByVo(MyQueryVo vo);
	
	public long totalUser();
	
	//查询所有订单 单表
	public List<Order> getOrderList();
	
	//继承类 订单信息 用户一对一查询  查询所有订单信息，关联查询下单用户信息
	public List<OrderUser> queryOrderUser();
	
	//改造包装类  一对一关联查询
	public List<Order> getOrderUserList();
	
	public List<MyUser> queryMyUserMyOrder();
	
	public List<User> queryWhereUser(User u);
	
	//xml中直接取key然后 得到value
	public List<User> queryByMap(Map<String,Object> m);
	
	public List<User> queryByMaps(Map<String,Object> m);
	
	
	public List<User> queryChoose(Map map);
	
	public int updateUsers(Map m);
	
	public int updateUserTrim(Map m);
}
