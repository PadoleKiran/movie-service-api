package com.devgen.movie.model;

import java.util.Date;

public class Movie {
    // this will represent one movie (will hold one movie detail)
    // movies(id, title, genre, release date, cast, director, ratings, reviews)
    private  int id;
    private String title;
    private String genre;
    private String releaseDate;
    private String cast;
    private String director;
    private double ratings;
    private String reviews;

    public Movie(int id, String title, String genre, String releaseDate, String cast, String director, String reviews, double ratings) {
        this.director = director;
        this.reviews = reviews;
        this.ratings = ratings;
        this.cast = cast;
        this.releaseDate = releaseDate;
        this.title = title;
        this.genre = genre;
        this.id = id;
    }

    // getters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public String getCast() {
        return cast;
    }

    public String getDirector() {
        return director;
    }

    public double getRatings() {
        return ratings;
    }

    public String getReviews() {
        return reviews;
    }


    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    public void setRatings(double ratings) {
        this.ratings = ratings;
    }

    public void setReviews(String reviews) {
        this.reviews = reviews;
    }


    // toString
    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", cast='" + cast + '\'' +
                ", director='" + director + '\'' +
                ", ratings=" + ratings +
                ", reviews='" + reviews + '\'' +
                '}';
    }
}
