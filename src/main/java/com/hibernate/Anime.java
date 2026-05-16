package com.hibernate;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Anime implements Serializable {
	@Id
	private String name;
	private String hero;
	private String villan;
	private int episodes;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHero() {
		return hero;
	}
	public void setHero(String hero) {
		this.hero = hero;
	}
	public String getVillan() {
		return villan;
	}
	public void setVillan(String villan) {
		this.villan = villan;
	}
	public int getEpisodes() {
		return episodes;
	}
	public void setEpisodes(int episodes) {
		this.episodes = episodes;
	}
	
	
}
