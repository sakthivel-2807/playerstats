package com.tech.playerstats.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.playerstats.controller.PlayerStats;
import com.tech.playerstats.dao.PlayerstatsDao;

@Service
public class PlayerstatsService {
	@Autowired
	PlayerstatsDao plydao;
	
	public String addply(List<PlayerStats> x) {
	return plydao.addply(x);
	}

}
