package com.hibernate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class DeleteAnime {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		String pk ="Dragon Ball";
		Anime an = em.find(Anime.class, pk);
		if(an!=null) {
			et.begin();
			em.remove(an);
			et.commit();
			System.out.println(pk+"Data Deleted !!!!!!");
		}
		else {
			System.out.println(pk+"is not exists");
		}
	}
}
