package com.itheima.springmvc.pojo;

import java.util.Date;

public class Order {

	private int id;
	
	private int userId;
	
	private String number;
	
	private Date createtime;
	
	private String note;
	
	//单向一对一关联查询  Order User
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", userId=" + userId + ", number=" + number
				+ ", createtime=" + createtime + ", note=" + note + ", user="
				+ user + "]";
	}

	
	
	
}
