package com.hibernate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class QueryParameter {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Hibernate");
		EntityManager em =emf.createEntityManager();
		
//		Query quy = em.createQuery("Select a from Anime a where a.name= ?1 and a.hero=?1");
		Query quy = em.createQuery("Select a from Anime a where a.name= :name1 and a.hero=:hero1");
		quy.setParameter("name1", "Dragon Ball");
		quy.setParameter("hero1", "goku");
		
		Anime a =(Anime) quy.getSingleResult();
		if(a!=null) {
			System.out.println(a.getEpisodes());
			System.out.println(a.getHero());
			System.out.println(a.getName());
			System.out.println(a.getVillan());
			
		}
		else {
			System.out.println("object doesn't exesits");
		}
	}
	
}
