package com.devgen.movie.client;
import com.devgen.movie.model.Movie;

import com.devgen.movie.service.MovieService;

import java.util.Scanner;

public class MovieAppClient {
    public static void main(String[] args) {
        MovieService movieService = new MovieService();

        // printing movie information
        // movieService.displayMovieInfo();

//        Scanner scanner = new Scanner(System.in);


        // Adding a new movie dynamically
//        movieService.addMovie(new Movie(6, "New Movie", "Action", "10-10-2023", "Chris Nolan", "Leonardo DiCaprio", "Excellent", 5.0));

        // Display updated movie list
//        movieService.displayMovieInfo();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMovie Management System");
            System.out.println("1. Add Movie");
            System.out.println("2. Display Movies");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    // Taking movie details from user
                    System.out.print("Enter Movie ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();  // Consume newline

                    System.out.print("Enter Movie Title: ");
                    String title = scanner.nextLine();

                    System.out.print("Enter Genre: ");
                    String genre = scanner.nextLine();

                    System.out.print("Enter Release Date: ");
                    String releaseDate = scanner.nextLine();

                    System.out.print("Enter Director Name: ");
                    String director = scanner.nextLine();

                    System.out.print("Enter Movie Cast: ");
                    String cast = scanner.nextLine();

                    System.out.print("Enter Movie Review: ");
                    String review = scanner.nextLine();

                    System.out.print("Enter Ratings (0-5): ");
                    double rating = scanner.nextDouble();

                    // Adding movie to service
                    movieService.addMovie(new Movie(id, title, genre, releaseDate, director, cast, review, rating));
                    break;

                case 2:
                    // Display all movies
                    movieService.displayMovieInfo();
                    break;

                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        }
    }
}
