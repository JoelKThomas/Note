package com.cts.service.list.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cts.model.User;
import com.cts.service.UserService;

@Service("userService")
public class UserServiceListImpl implements UserService {

	private List<User> userList = new ArrayList<User>();

	
	private void init() {
		User user = new User();
		user.setId("joel");
		user.setPassword("joel");
		userList.add(user);
		
		user = new User();
		user.setId("karthik");
		user.setPassword("karthik");
		userList.add(user);
		
	    user = new User();
		user.setId("manoj");
		user.setPassword("manoj");
		userList.add(user);
	}
	@Override
	public boolean save(User user) {

		// check whether the record is already exist or not
		if (get(user.getId()) == null) {
			userList.add(user);
			return true;
		}
		// if the record already exist
		return false;
	}

	@Override
	public boolean update(User user) {

		// check record exist or not
		// if it is exist, then update
		if (user == null) {
			return false;
		}
		if (get(user.getId()) != null) {
			userList.add(user);
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(String id) {
		User user = get(id);
		if (user != null) {
			userList.remove(user);
			return true;
		}

		return false;
	}

	@Override
	public User get(String id) {

		for (User user : userList) {
			if (id.equals(user.getId())) {
				return user;
			}
		}

		return null;
	}

	@Override
	public boolean get(String id, String password) {
		init();
		User user = get(id);
		if (user == null) {
			return false;
		}
		if (user.getPassword().equals(password)) {
			return true;
		}
		return false;
	}

	@Override
	public List<User> get() {
		// TODO Auto-generated method stub
		return null;
	}

}
