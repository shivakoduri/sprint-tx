/**
 * 
 */
package com.myproject.examples.dao;

import java.util.List;

import com.myproject.examples.model.User;


/**
 * @author shiva koduri
 *
 */
public interface UserDAO {

	void insertUser(User user);

	List<User> findAllUsers();
}
