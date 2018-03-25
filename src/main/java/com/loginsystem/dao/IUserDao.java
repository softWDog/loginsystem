package com.loginsystem.dao;

import com.loginsystem.domain.User;

/**
 * @author gethin
 * @version 创建时间：2018年3月25日 上午11:16:57 类说明
 */
public interface IUserDao {
	/**
	 * 8 * 根据用户名和密码来查找用户 9 * @param userName
	 * 
	 * @param userPwd
	 * @return 查到到的用户
	 */
	User find(String userName, String userPwd);

	/**
	 * 添加用户
	 * 
	 * @param user
	 */
	void add(User user);

	/**
	 * 根据用户名来查找用户
	 * 
	 * @param userName
	 * @return 查到到的用户
	 */
	User find(String userName);
}
