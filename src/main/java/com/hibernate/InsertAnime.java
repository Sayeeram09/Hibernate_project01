package com.hibernate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class InsertAnime {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Anime a = new Anime();
		a.setName("God of war");
		a.setHero("atsu");
		a.setVillan("satio");
		a.setEpisodes(90);
		
		et.begin();
		em.persist(a);
		et.commit();
		System.out.println("Data Saved!!!!!!");		
	}
}
