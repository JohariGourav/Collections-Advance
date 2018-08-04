//Test Class for MovieDetails to add movie objects
package com.cg.movieDetails;

public class TestMovieDetails {

	public static void main(String[] args) {

		Movie_DetailsList movie_DetailsList = new Movie_DetailsList();

		movie_DetailsList.addMovie(new Movie_Details("Shagird", "Nana Patekar", "A girl", "Thriller"));
		movie_DetailsList.addMovie(new Movie_Details("Gold", "Akshay Kumar", "uni Rouy", "Sports"));
		movie_DetailsList.addMovie(new Movie_Details("Holiday", "Akshay Kumar", "Sonakshi", "Thriller"));

		// print all movies
		for (Movie_Details md : movie_DetailsList.movie) {
			System.out.println(md);
		}

		// Search movie by movie name
		boolean result = movie_DetailsList.find_Movie_by_MovieName("Holiday");
		if (result)
			System.out.println("Movie found by Movie name");
		else
			System.out.println("Movie not found");

		// Search movie by movie Genre
		boolean resultGenre = movie_DetailsList.find_Movie_by_Genre("Thriller");
		if (resultGenre)
			System.out.println("Movie found by genre");
		else
			System.out.println("Movie not found");

		// Remove particular movie
		movie_DetailsList.removeMovie("Gold");

		// print
		movie_DetailsList.display();

		// remove all movies
		movie_DetailsList.removeAllMovies();

	}

}
