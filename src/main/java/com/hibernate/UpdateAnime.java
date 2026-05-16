package com.hibernate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class UpdateAnime {
	public static void main(String[] args) {
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("Hibernate");
		EntityManager em =emf.createEntityManager();
		EntityTransaction et =em.getTransaction();
		
		String pk = "Dragon Ball";
		Anime an=em.find(Anime.class, pk);
		
		if(an!=null) {
			an.setEpisodes(80);
			et.begin();
			em.merge(an);
			et.commit();
			System.out.println(pk+"is Updated");
		}
		else {
			System.out.println(pk+"is not exists");
		}
	}
}
