package com.loginsystem.service.impl;

import com.loginsystem.dao.IUserDao;
import com.loginsystem.dao.impl.IUserDaoImpl;
import com.loginsystem.domain.User;
import com.loginsystem.execption.UserExistException;
import com.loginsystem.service.IUserService;

public class UserServiceImpl implements IUserService {

	private IUserDao userDao = new IUserDaoImpl();
	
	public void registerUser(User user) throws UserExistException  {
		if (userDao.find(user.getUserName())!=null) {
			//checked exception 
			//unchecked exception
			//这里抛编译时异常的原因：是我想上一层程序处理这个异常，以给用户一个友好提示
			throw new UserExistException("注册的用户名已存在！！！");
		}
		userDao.add(user);
	}

	public User loginUser(String userName, String userPwd) {
		return userDao.find(userName, userPwd);
	}

}
