package com.devgen.movie.service;

import com.devgen.movie.model.Movie;

import java.security.PrivateKey;

public class MovieService {
    // maintaining movies = ( curd ) - create, read, update, delete

    // calling movie object
    private Movie[] movie = new Movie[5];

    public MovieService() {

        movie[0] = new Movie(1,"Kp movie","love", "2-1-2018","kunal","kiran","Good",4.5);
        movie[1] = new Movie(2,"Jp movie","fiting", "2-1-2018","ninad","kunal","Good",4.5);
        movie[2] = new Movie(3,"Ap movie","love", "2-1-2018","rj","Bhushan","Good",4.5);
        movie[3] = new Movie(4,"Bp movie","love", "2-1-2018","varun","sunil","Good",4.5);
        movie[4] = new Movie(5,"Pp movie","love", "2-1-2018","sharukh","krishna","Good",4.5);

        displayMovie();
    }

    private void displayMovie() {
        for (int i=0;i< movie.length;i++){
            System.out.println("Movie Number     : " + movie[i].getId());
            System.out.println("Movie Title/Name : " + movie[i].getTitle());
            System.out.println("Genre            : " + movie[i].getGenre());
            System.out.println("Director Name    : " + movie[i].getDirector());
            System.out.println("Movie Cast       : " + movie[i].getCast());
            System.out.println("Release Date     : " + movie[i].getReleaseDate());
            System.out.println("Ratings          : " + movie[i].getRatings());
            System.out.println("Movie Reviews    : " + movie[i].getReviews());
            System.out.println("=============================================================================================");
        }
    }


}
