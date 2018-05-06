package com.asad.wingChunHorfiashWithSpringBoot;

import org.springframework.stereotype.Component;

@Component
public class UserValidator {

	private String usreNameValide;
	private String emailValide;
	
	
	
	
	
	public String getUsreNameValide() {
		return usreNameValide;
	}
	public void setUsreNameValide(String usreNameValide) {
		this.usreNameValide = usreNameValide;
	}
	public String getEmailValide() {
		return emailValide;
	}
	public void setEmailValide(String emailValide) {
		this.emailValide = emailValide;
	}
	
	
}
