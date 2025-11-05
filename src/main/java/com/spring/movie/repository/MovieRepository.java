package com.spring.movie.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.movie.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
