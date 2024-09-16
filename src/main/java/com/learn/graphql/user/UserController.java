package com.learn.graphql.user;

import java.util.List;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class UserController {

	private UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@MutationMapping
	public User createUser(@Argument String name, @Argument String phone, @Argument String email,
			@Argument String password) {
		  User user = new User();
		  user.setName(name);
		  user.setEmail(email);
		  user.setPassword(password);
		  user.setPhone(phone);
		return userService.creatUser(user);
	}
	
	@MutationMapping(name = "updateUser")
	public User updateUser(@Argument String name, @Argument String phone, @Argument String email,
			@Argument String password, @Argument int userId) {
		 User user = new User();
		  user.setName(name);
		  user.setEmail(email);
		  user.setPassword(password);
		  user.setPhone(phone);
		  user.setUserId(userId);
		return userService.updateUser(user);
	}
	
	@QueryMapping(name = "getUsers")
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}

	
	@QueryMapping(name = "getUser")
	public User getUser(@Argument int userId) {
		return userService.getUser(userId);
	}
	
	@MutationMapping(name ="deleteUser")
	public boolean deleteUser(int userId) {
		return userService.deleteUser(userId);
	}
	
}
