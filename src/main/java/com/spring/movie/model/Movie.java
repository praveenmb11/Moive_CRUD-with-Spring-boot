package com.spring.movie.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String description;
	private String poster_link;
	private String trailer_link;
	private String rating;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPoster_link() {
		return poster_link;
	}
	public void setPoster_link(String poster_link) {
		this.poster_link = poster_link;
	}
	public String getTrailer_link() {
		return trailer_link;
	}
	public void setTrailer_link(String trailer_link) {
		this.trailer_link = trailer_link;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	 
}
