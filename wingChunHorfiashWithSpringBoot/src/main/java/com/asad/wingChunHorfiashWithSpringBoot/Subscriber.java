package com.asad.wingChunHorfiashWithSpringBoot;



public class Subscriber {
	
	private Integer id;
	
	private String email;

	public Subscriber(String email) {
		this.email = email;
	}

	public Subscriber() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return this.id + " " + this.email;
	}

}
