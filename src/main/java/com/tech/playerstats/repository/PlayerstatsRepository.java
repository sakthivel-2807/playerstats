package com.tech.playerstats.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tech.playerstats.controller.PlayerStats;

public interface PlayerstatsRepository extends JpaRepository<PlayerStats, Integer>  {
	
	
}