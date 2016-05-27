/**
 * 
 */
package com.myproject.examples.service;

import java.util.List;

import com.myproject.examples.model.User;

/**
 * @author shiva koduri
 *
 */
public interface UserService {
	

	void insertUser(User user);

	List<User> findAllUsers();

}
