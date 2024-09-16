package com.learn.graphql.user;

import java.util.List;

import org.springframework.stereotype.Service;

import com.learn.graphql.helper.ExceptionHelper;

@Service
public class UserService {

	private UserRepo userRepo;

	public UserService(UserRepo userRepo) {
		this.userRepo = userRepo;
	}

//	 creating user
	
	public User creatUser(User user) {
		return userRepo.save(user);
	}

//	getting all users
	
	public List<User> getAllUsers() {
		return userRepo.findAll();
	}

//	getting single user

	public User getUser(int userId) {
		return userRepo.findById(userId).orElseThrow(ExceptionHelper::throwResourceNotFoundException);
	}

//	updating user

	public User updateUser(User user) {
		User oldUser = userRepo.findById(user.getUserId()).orElseThrow(ExceptionHelper::throwResourceNotFoundException);
		oldUser.setEmail(user.getEmail());
		oldUser.setName(user.getName());
		oldUser.setPhone(user.getPhone());
		oldUser.setPassword(user.getPassword());
		oldUser.setUserId(oldUser.getUserId());
		User updatedUser = userRepo.save(oldUser);
		return updatedUser;
	}

//	Deleting user

	public boolean deleteUser(int userId) {
		User user = userRepo.findById(userId).orElseThrow(ExceptionHelper::throwResourceNotFoundException);
		userRepo.delete(user);
		return true;
	}

}
