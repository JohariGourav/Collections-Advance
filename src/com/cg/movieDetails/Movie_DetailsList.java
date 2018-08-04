//Movie details list class to maintain all objects from MovieDetails
package com.cg.movieDetails;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.*;

public class Movie_DetailsList {

	Comparator<Movie_Details> comparator = (arg1, arg2) -> arg1.getMov_Name().compareTo(arg2.getMov_Name());
	Set<Movie_Details> movie = new TreeSet<>(comparator);

	// method to add movie
	public void addMovie(Movie_Details movie_Name) {
		movie.add(movie_Name);
	}

	// method to remove movie
	public void removeMovie(String movie_Name) {
		Predicate<Movie_Details> remMovie = Movie_Details -> (Movie_Details.getMov_Name().equals(movie_Name));
		movie.removeIf(remMovie);

	}

	// method to remove all movies
	public void removeAllMovies() {
		movie.clear();
		System.out.println("All Movies removed");
	}

	// method to find movie by Name
	public boolean find_Movie_by_MovieName(String movie_name) {

		Predicate<Movie_Details> getMovieByName = Movie_Details -> (Movie_Details.getMov_Name().equals(movie_name));
		return movie.stream().anyMatch(getMovieByName);
	}

	// method to find movie by Genre
	public boolean find_Movie_by_Genre(String genre) {

		Predicate<Movie_Details> getMovieByGenre = Movie_Details -> (Movie_Details.getGenre().equals(genre));
		return movie.stream().anyMatch(getMovieByGenre);
	}

	// display method to show all movies
	public void display() {
		Consumer<Movie_Details> disp = Movie_Details -> System.out.println(Movie_Details);
		movie.stream().forEach(disp);
	}
}
