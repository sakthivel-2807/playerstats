package com.tech.playerstats.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tech.playerstats.controller.PlayerStats;
import com.tech.playerstats.repository.PlayerstatsRepository;

@Repository
public class PlayerstatsDao {
	@Autowired
	PlayerstatsRepository plyrepo;
	
	public String addply(List<PlayerStats> x) {
		plyrepo.saveAll(x);
		return "success";
		
	}

}
