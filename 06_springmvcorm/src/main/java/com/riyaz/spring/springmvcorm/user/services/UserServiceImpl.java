package com.riyaz.spring.springmvcorm.user.services;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.riyaz.spring.springmvcorm.user.dao.UserDao;
import com.riyaz.spring.springmvcorm.user.entity.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao dao;

	public UserDao getDao() {
		return dao;
	}

	public void setDao(UserDao dao) {
		this.dao = dao;
	}

	@Override
	@Transactional
	public int save(User user) {
		// some business logic
		return dao.create(user);
	}

	@Override
	public List<User> getUsers() {
		List<User> lst = dao.findUsers();
		Collections.sort(lst);
		return lst;
	}
}
