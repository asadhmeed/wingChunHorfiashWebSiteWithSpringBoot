package com.asad.wingChunHorfiashWithSpringBoot.users;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asad.wingChunHorfiashWithSpringBoot.User;



@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository dao;

	@Override
	
	public User addUser(User user) {
		dao.save(user);
		return user;
	}
	
	
	public String findUserByUserName(User user) {
		try {
		String userName = dao.findUserByUserName(user.getUserName()).getUserName();
		return userName;
		}catch(Exception e){
			e.getMessage();
			return "";
		}
	}
	public String findUserByEmail(User user) {
		try {
			String email = dao.findUserByEmail(user.getEmail()).getEmail();
			return email;
			}catch(Exception e){
				e.getMessage();
				return "";
			}
	}

	@Override
	public User findUserByEmailAndPassword(String email, String password) {
//		TypedQuery<UserEntity> query = entityManager
//				.createQuery("select u from User u "
//						+ "where u.email = :email "
//						+ "and u.password = :pass", UserEntity.class);
//		query.setParameter("email", email);
//		query.setParameter("pass", password);
//		return query.getSingleResult();
		return null;
	}

	@Override
	public User findUserByUserNameAndPassword(String userName, String password) {
//		TypedQuery<UserEntity> query = entityManager
//				.createQuery("select u from User u "
//						+ "where u.userName = :userName "
//						+ "and u.password = :pass", UserEntity.class);
//		query.setParameter("userName", userName);
//		query.setParameter("pass", password);
//
//		return query.getSingleResult();
		return null;
	}

	@Override
	
	public boolean removeUser(User user) {
//		// TODO:try catch
//		entityManager.remove(user);
//		return true;
		return true;

	}

}
