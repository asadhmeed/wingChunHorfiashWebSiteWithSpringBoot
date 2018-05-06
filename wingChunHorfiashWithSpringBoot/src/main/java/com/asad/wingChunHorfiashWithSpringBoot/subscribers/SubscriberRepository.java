package com.asad.wingChunHorfiashWithSpringBoot.subscribers;

import org.springframework.data.repository.CrudRepository;


import com.asad.wingChunHorfiashWithSpringBoot.SubscriberEntity;

public interface SubscriberRepository extends CrudRepository<SubscriberEntity, Integer> {

//	public Subscriber insertSubsecriber(Subscriber subscriber);
	SubscriberEntity findSubseriberEntityByEmail(String email);
	
	
}
