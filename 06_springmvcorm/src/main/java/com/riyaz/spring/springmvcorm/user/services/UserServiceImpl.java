package com.riyaz.spring.springmvcorm.user.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.riyaz.spring.springmvcorm.user.dao.UserDao;

@Service
public class UserServiceImpl {
	
	@Autowired
	private UserDao dao;

	public UserDao getDao() {
		return dao;
	}

	public void setDao(UserDao dao) {
		this.dao = dao;
	}
}
