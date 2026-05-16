package com.composite;

import jakarta.persistence.Embeddable;

@Embeddable
public class Profile {

	private long mob;
	private String email;
	
	
	
	public long getMob() {
		return mob;
	}
	public void setMob(long mob) {
		this.mob = mob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}


}
