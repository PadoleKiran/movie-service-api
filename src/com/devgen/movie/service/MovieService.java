package com.devgen.movie.service;

import com.devgen.movie.model.Movie;
import java.util.Arrays;
//import java.security.PrivateKey;

public class MovieService {
    // maintaining movies = ( curd ) - create, read, update, delete
    // calling movie object
    // private Movie[] movie = new Movie[5];
    private Movie[] movies = new Movie[5];
    private int count = 0;  // Tracks number of movies added

    public MovieService() {
        // Adding initial movies
        addMovie(new Movie(1, "Kp movie", "love", "2-1-2018", "kunal", "kiran", "Good", 4.5));
        addMovie(new Movie(2, "Jp movie", "fighting", "2-1-2018", "ninad", "kunal", "Good", 4.5));
        addMovie(new Movie(3, "Ap movie", "love", "2-1-2018", "rj", "Bhushan", "Good", 4.5));
        addMovie(new Movie(4, "Bp movie", "love", "2-1-2018", "varun", "sunil", "Good", 4.5));
        addMovie(new Movie(5, "Pp movie", "love", "2-1-2018", "sharukh", "krishna", "Good", 4.5));

        displayMovieInfo();
    }

    // Method to add a new movie
    public void addMovie(Movie newMovie) {

        if (count == movies.length) {
            // Resize array when full
            movies = Arrays.copyOf(movies, movies.length + 1);
        }
        movies[count++] = newMovie;
        System.out.println("Movie added successfully: " + newMovie.getTitle());
    }

    // Method to search for movies by title, director, or genre
    public void searchMovie(String keyword) {
        boolean found = false;
        System.out.println("\n===== Search Results for '" + keyword + "' =====");
        for (int i = 0; i < count; i++) {
            if (movies[i].getTitle().equalsIgnoreCase(keyword) ||
                    movies[i].getDirector().equalsIgnoreCase(keyword) ||
                    movies[i].getGenre().equalsIgnoreCase(keyword)) {

                System.out.println("Movie Number     : " + movies[i].getId());
                System.out.println("Movie Title/Name : " + movies[i].getTitle());
                System.out.println("Genre            : " + movies[i].getGenre());
                System.out.println("Director Name    : " + movies[i].getDirector());
                System.out.println("Movie Cast       : " + movies[i].getCast());
                System.out.println("Release Date     : " + movies[i].getReleaseDate());
                System.out.println("Ratings          : " + movies[i].getRatings());
                System.out.println("Movie Reviews    : " + movies[i].getReviews());
                System.out.println("============================================");
                found = true;
            }
        }
        if (!found) {
            System.out.println("No movies found with keyword: " + keyword);
        }
    }

    // Method to display movies
    public void displayMovieInfo() {
        System.out.println("\n===== Movie List =====");
        for (int i = 0; i < count; i++) {
            System.out.println("Movie Number     : " + movies[i].getId());
            System.out.println("Movie Title/Name : " + movies[i].getTitle());
            System.out.println("Genre            : " + movies[i].getGenre());
            System.out.println("Director Name    : " + movies[i].getDirector());
            System.out.println("Movie Cast       : " + movies[i].getCast());
            System.out.println("Release Date     : " + movies[i].getReleaseDate());
            System.out.println("Ratings          : " + movies[i].getRatings());
            System.out.println("Movie Reviews    : " + movies[i].getReviews());
            System.out.println("============================================");
        }
    }




}
