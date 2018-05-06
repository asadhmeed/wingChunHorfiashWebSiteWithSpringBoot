package com.asad.wingChunHorfiashWithSpringBoot;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import com.asad.wingChunHorfiashWithSpringBoot.subscribers.SubscriberService;
import com.asad.wingChunHorfiashWithSpringBoot.users.UserService;
import com.asad.wingChunHorfiashWithSpringBoot.validEmail.EmailValidator;




@org.springframework.web.bind.annotation.RestController
public class RestController {

	@Autowired
	private SubscriberService subscriberService;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private UserValidator userValidator;
	
	
	@GetMapping("/test")
	public String test() {
		return "test";
	}
	
	
	
	// subscribers
	@PostMapping("/addSubscriber")
	
	public int saveSubscriber(@Valid @RequestBody SubscriberEntity subscriber) {
		 System.out.println(subscriber);
		 if(new EmailValidator().validateEmail(subscriber.getEmail())) {
			if (this.subscriberService.findSubscriberByEmail(subscriber.getEmail()) == null) {
				return -2;
			} else {
				subscriberService.addSubsecriber(subscriber);
				return subscriber.getId();
			} 
		 }
		 return -1;
			 	 
		 
			
			 
			 
		 
		
		
	}
	
	
	@PostMapping("/removeSubscriber")
	public SubscriberEntity removeSubscriberByEmail(@Valid @RequestBody SubscriberEntity subscriber) {
		if(new EmailValidator().validateEmail(subscriber.getEmail())) {
			if (this.subscriberService.findSubscriberByEmail(subscriber.getEmail()) == null) {
				return new SubscriberEntity("-2");
			} else {
				return subscriberService.removeSubscriberByEmail(subscriber.getEmail()); 
			} 
		 }
		 return new SubscriberEntity("-1");
		
		
	}
	
	//users
	
	
	@PostMapping("/addUser")
	public UserValidator addUser(@Valid @RequestBody User user) {
			
		 try {
			this.userValidator.setUsreNameValide(this.userService.findUserByUserName(user));
			this.userValidator.setEmailValide(this.userService.findUserByEmail(user));
			 userService.addUser(user);	 
		 }catch(Exception e) {
			 System.out.println(e.getMessage());
			 return this.userValidator;
			 
		 }
		
		return this.userValidator;
	}
	
}
