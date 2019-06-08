/**
 * 
 */
package com.cts.service;

import java.util.List;

import com.cts.model.User;

/**
 * @author Joel
 *
 */
public interface UserService {
	
	//CRUD operations
	
	
	//create new user
	
	public boolean save(User user);
	
	//update existing user
	
	public boolean update(User user);
	
	//delete existing user
	
	public boolean delete(String id);
	
	//get user by ID
	
	public User get(String id);
	
	//validate credentials
	
	//if the credentials are valid - return true
	//false
	public boolean get(String id, String password);
	
	//if the credentials are valid - return user
	//other wise null
	//public User validate();
	
	
    //get all the user
	public List<User> get();
	
}
