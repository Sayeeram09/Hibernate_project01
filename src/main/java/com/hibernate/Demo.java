package com.hibernate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Demo {
	public static void main(String[] args) {
		//establishing the connection
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("Hibernate");
		System.out.println("Connection Establishing....");
		//create entity manager to perform crud operation
		EntityManager em=emf.createEntityManager();
		System.out.println("cm Created");
		//create transaction to begin and commit the transaction
		EntityTransaction et=em.getTransaction();
		System.out.println("Transaction is created...");
		//begin the transaction
		et.begin();	
		//create the object of student class and set the value
		Anime s=new Anime();
		// s.setId(1);
		// s.setName("John");
		// s.setCity("New York");
		// //persist the object
		em.persist(s);
		//commit the transaction
		et.commit();
		System.out.println("Data Inserted...");
	}
}
