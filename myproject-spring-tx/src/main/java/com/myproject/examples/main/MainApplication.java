/**
 * 
 */
package com.myproject.examples.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.myproject.examples.model.User;
import com.myproject.examples.service.UserService;

/**
 * @author shiva koduri
 *
 */
public class MainApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		UserService service = (UserService) applicationContext.getBean("userServiceImpl");
		
		List<User> list = service.findAllUsers();
		System.out.println("list size:" + list.size());
		
		User user = new User();
		user.setName("ksp");
		user.setUsername("prasad");
		service.insertUser(user);
		
		list = service.findAllUsers();
		System.out.println("list size:" + list.size());
	}

}
