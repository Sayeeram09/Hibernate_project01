package com.hibernate;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class FetchAll {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Hibernate");
		EntityManager em =emf.createEntityManager();
		
		Query qry=em.createQuery("Select a from Anime a");
		
		List<Anime> li = qry.getResultList() ;
		for(Anime a: li) {
			System.out.println("----------------------------------------------");
			System.out.println(a.getEpisodes());
			System.out.println(a.getHero());
			System.out.println(a.getName());
			System.out.println(a.getVillan());
			System.out.println("----------------------------------------------");
		}
	}
}
