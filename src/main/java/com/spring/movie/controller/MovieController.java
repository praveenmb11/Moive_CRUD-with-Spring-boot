package com.spring.movie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.spring.movie.model.Movie;
import com.spring.movie.service.MovieService;

@Controller
public class MovieController {

	@Autowired
	MovieService movieService;
	@GetMapping("/")
	public String viewHome() {
	return "home";
	}
	@GetMapping("/add")
	public String viewInsert() {
		return "insert";
	}
	
	@PostMapping("/add")
	public String insert(@ModelAttribute Movie movie, ModelMap modelMap) {
		movieService.insert(movie);
		modelMap.put("movies", "Data Inserted");
		return "home";
	}
	
	@GetMapping("/fall")
	public String fetchall(ModelMap modelMap) {
		modelMap.put("movies", movieService.fetchall());
		return "fetch";
	}
}
