/**
 * 
 */
package com.myproject.examples.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.myproject.examples.dao.UserDAO;
import com.myproject.examples.model.User;

/**
 * @author shiva koduri
 *
 */
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDAO userDAO;
	
	public List<User> findAllUsers() {
		return userDAO.findAllUsers();
	}
	
	@Transactional
	public void insertUser(User user) {
		userDAO.insertUser(user);
	}

}
