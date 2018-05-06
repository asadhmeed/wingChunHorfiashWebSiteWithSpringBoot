package com.asad.wingChunHorfiashWithSpringBoot.subscribers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.asad.wingChunHorfiashWithSpringBoot.SubscriberEntity;

@Service
public class SubscriberServiceImpl implements SubscriberService {

	@Autowired
	private SubscriberRepository dao;

	
	public SubscriberEntity addSubsecriber(SubscriberEntity subscriber) {
		
		
		return dao.save(subscriber);
	}
	
	public SubscriberEntity findSubscriberByEmail(String email) {
		SubscriberEntity subscriber=new SubscriberEntity();
		try {
			 subscriber=	dao.findSubseriberEntityByEmail(email);
		
		}catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
		return subscriber;
	}
	
	@Override
	public SubscriberEntity removeSubscriberByEmail(String email) {
		SubscriberEntity subscriber=	dao.findSubseriberEntityByEmail(email);
		
		dao.delete(subscriber);
//		
		return subscriber; 

	}
}
