package com.tech.playerstats.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.tech.playerstats.service.PlayerstatsService;


@RestController
public class PlayerstatsController {
	@Autowired
	RestTemplate rst;
	@Autowired
	PlayerstatsService plyscr;
	
	@GetMapping(value="/getstats")
	public List<PlayerStats> getstats() {
		String url1="http://localhost:8080/getallply";
		String url2="http://localhost:8081/getodibyJno/ ";
		String url3="http://localhost:8081/getiplbyJno/  ";
		ResponseEntity<List<PlayerStats>> res1 = rst.exchange(url1, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<PlayerStats>>() {
				});
		List<PlayerStats> e1 = res1.getBody();
		e1.forEach(x -> {
			int jn = x.getJerseyno();
			ResponseEntity<Integer> res2 = rst.exchange(url2+jn, HttpMethod.GET, null, Integer.class);
			int odi = res2.getBody();
			ResponseEntity<Integer> res3 = rst.exchange(url3+jn, HttpMethod.GET, null, Integer.class);
			int ipl = res3.getBody();
		     x.setTotalscore(odi+ipl);
		});
		return e1;
	}
	@PostMapping(value="/addply")
	public String addply() {
		List<PlayerStats> x=getstats();
		return plyscr.addply(x);
	}

}
