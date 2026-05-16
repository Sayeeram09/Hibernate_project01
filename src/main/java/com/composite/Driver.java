package com.composite;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Driver {

	public static void main(String[] args) {
		
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("Hibernate");
		EntityManager em =emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Profile p =new Profile();
		p.setEmail("abc@gmail.com");
		p.setMob(9785);
		
		Person per=new Person();
		per.setAge(22);
		per.setName("Hemanath");
		per.setP(p);
		
		
		et.begin();
		em.persist(per);
		et.commit();
		System.out.println("Data Saved!!!!!!");
	}
}

