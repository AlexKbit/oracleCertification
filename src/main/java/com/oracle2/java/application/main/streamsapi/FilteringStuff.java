package com.oracle2.java.application.main.streamsapi;

import java.util.Arrays;
import java.util.List;


public class FilteringStuff {
	public static void main(String[] args) {
		List<Movie> movies = Arrays.asList(
				new Movie("Titanic", Movie.Genre.DRAMA, 'U'),
				new Movie("Psycho", Movie.Genre.THRILLER, 'U'), 
				new Movie("Oldboy", Movie.Genre.THRILLER, 'R'), 
				new Movie("Shining", Movie.Genre.HORROR, 'U')
		);
		
		movies.stream().filter(mov->mov.getRating()=='R')
		.peek(mov->System.out.println(mov.getName()))
		.map(mov->mov.getName());
		
	}
}
	


class Movie {
	static enum Genre {
		DRAMA, THRILLER, HORROR, ACTION 
	};
	
	private Genre genre;
	private String name;
	private char rating = 'R';
	Movie(String name, Genre genre, char rating) {
		this.name = name; 
		this.genre = genre; 
		this.rating = rating;
	}
	public Genre getGenre() {
		return genre;
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getRating() {
		return rating;
	}
	public void setRating(char rating) {
		this.rating = rating;
	} 
	
}