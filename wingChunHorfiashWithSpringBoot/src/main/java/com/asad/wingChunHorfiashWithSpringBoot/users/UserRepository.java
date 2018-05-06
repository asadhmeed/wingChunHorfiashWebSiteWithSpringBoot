package com.asad.wingChunHorfiashWithSpringBoot.users;

import org.springframework.data.repository.CrudRepository;

import com.asad.wingChunHorfiashWithSpringBoot.User;



public interface UserRepository extends CrudRepository<User, Integer> {

	User findUserByUserName(String userName);
	User findUserByEmail(String email);
}
