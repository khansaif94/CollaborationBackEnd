package com.niit.dao;

import java.util.List;

import com.niit.models.User;

public interface UserDao {
	
	boolean saveUser(User user);

	List<User> getAllUser();

	User getUserById(String id);
	
	boolean updateUser(User user);
	
	boolean deleteUser(User user);
	
	public User isValidate(String email,String password);
	
	public void setOnline(String id);
}
