package com.cn.fzd.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.fzd.dao.IUserDao;
import com.cn.fzd.pojo.User;
import com.cn.fzd.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	private IUserDao userDao;
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userId);
	}

}
