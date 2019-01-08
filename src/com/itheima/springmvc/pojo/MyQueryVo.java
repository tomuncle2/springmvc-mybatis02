package com.itheima.springmvc.pojo;

import java.io.Serializable;
import java.util.List;
/**
 * new Message
 * @author lx
 *pojo包装类  输入包装pojo
 */
public class MyQueryVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//
	private User user;
	
	List<Integer> idsList;
	
	Integer[] ids;
	
	
	public List<Integer> getIdsList() {
		return idsList;
	}
	public void setIdsList(List<Integer> idsList) {
		this.idsList = idsList;
	}
	public Integer[] getIds() {
		return ids;
	}
	public void setIds(Integer[] ids) {
		this.ids = ids;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	


}
