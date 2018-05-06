package com.asad.wingChunHorfiashWithSpringBoot.users;

import com.asad.wingChunHorfiashWithSpringBoot.User;

public interface UserService {

	User addUser(User user);

	User findUserByEmailAndPassword(String email, String password);

	User findUserByUserNameAndPassword(String userName, String password);

	boolean removeUser(User user);

	String findUserByUserName(User user);
	String findUserByEmail(User user);

}