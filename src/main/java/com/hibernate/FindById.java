package com.hibernate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class FindById {
	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("Hibernate");
		EntityManager em =emf.createEntityManager();
		
		String pk= "Dragon Ball";
		Anime a= em.find(Anime.class, pk);
		if(a!=null) {
			System.out.println("details of "+pk+" are ");
			System.out.println("Name is "+a.getName());
			System.out.println("Hero is "+a.getHero());
			System.out.println("Villan is "+a.getVillan());
			System.out.println("Episodes are :"+a.getEpisodes());
			
		}
		else {
			System.out.println(pk+" is not exists");
		}
	}
}
