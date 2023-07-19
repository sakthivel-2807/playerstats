package com.tech.playerstats.controller;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ply_stats")
public class PlayerStats {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	private int jerseyno;
	private String playername;
	private String gender;
	private String country;
	private int totalscore;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getJerseyno() {
		return jerseyno;
	}
	public void setJerseyno(int jerseyno) {
		this.jerseyno = jerseyno;
	}
	public String getPlayername() {
		return playername;
	}
	public void setPlayername(String playername) {
		this.playername = playername;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getTotalscore() {
		return totalscore;
	}
	public void setTotalscore(int totalscore) {
		this.totalscore = totalscore;
	}
	
	
	
	
}
