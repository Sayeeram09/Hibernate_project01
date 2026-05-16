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
		
	}
}
