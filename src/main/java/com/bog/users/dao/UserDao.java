package com.bog.users.dao;

import com.bog.users.model.User;

public interface UserDao {

	User findByUserName(String username);

}