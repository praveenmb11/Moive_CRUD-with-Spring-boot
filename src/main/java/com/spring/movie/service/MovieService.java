package com.spring.movie.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.movie.model.Movie;
import com.spring.movie.repository.MovieRepository;

@Service
public class MovieService {
	@Autowired
	MovieRepository movieRepository;

	public void insert(Movie movie) {
		 movieRepository.save(movie);
	}
	public List<Movie> fetchall() {
		return movieRepository.findAll();
	}
	
	public void deleteMovie(long id) {
		movieRepository.deleteById(id);
	}
	
	public Movie findByID(long id) {
		Optional<Movie> optional=movieRepository.findById(id);
		return optional.get();
	}
}

