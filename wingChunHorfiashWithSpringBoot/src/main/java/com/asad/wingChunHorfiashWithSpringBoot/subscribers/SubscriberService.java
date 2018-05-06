package com.asad.wingChunHorfiashWithSpringBoot.subscribers;

import com.asad.wingChunHorfiashWithSpringBoot.SubscriberEntity;
import com.asad.wingChunHorfiashWithSpringBoot.User;

public interface SubscriberService {
	//subscribers
	SubscriberEntity addSubsecriber(SubscriberEntity subscriber);
	
	SubscriberEntity removeSubscriberByEmail(String email);

	public SubscriberEntity findSubscriberByEmail(String email);
	
	
	
	
	
	
	
	
	
	
	
	

}