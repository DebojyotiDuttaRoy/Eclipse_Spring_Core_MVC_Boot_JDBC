package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.controller.UserRegDTO;
import com.dao.UserDao;

@Service
public class UserServiceImpl implements UserService {	
	@Autowired
	UserDao repo;
	
	@Override
	public boolean registerUser(UserRegDTO user) {
		return repo.registerUser(user) > 0 ? true : false;
	}
}
