package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.controller.UserRegDTO;

@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	JdbcTemplate jdbc;
	
	@Override
	public int registerUser(UserRegDTO u) {
		String sql="insert into tbl_user(name, user_name, password, countery, gender) values(?,?,?,?,?)";
		try {
			return jdbc.update(sql, u.getName(), u.getUserName(), u.getPassword(), u.getCountery(), u.getGender());
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}
}
