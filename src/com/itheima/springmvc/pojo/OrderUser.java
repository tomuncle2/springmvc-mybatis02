package com.itheima.springmvc.pojo;

//继承用户信息查询对象   用来封装多表查询结果
public class OrderUser extends Order{

	private String username;
	
	private String address;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "OrderUser [username=" + username + ", address=" + address + "]"
				+super.toString();
	}
	
	
}
