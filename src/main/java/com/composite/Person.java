package com.composite;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class Person {
		@EmbeddedId
		private Profile p;
		private String name;
		private int age;
		
		
		public Profile getP() {
			return p;
		}
		public void setP(Profile p) {
			this.p = p;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
				
}
