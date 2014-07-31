package com.sau.swagger.intg;

import java.util.HashMap;
import java.util.Map;

public class UserServiceImpl implements UserService {

	// Cache for dummy services
	Map<String, User> cache = new HashMap<String, User>();

	@Override
	public User getUser(String username) {
		return cache.get(username);
	}

	@Override
	public User getUser(User user) {
		cache.put(user.getName(), user);
		return user;
	}

}
