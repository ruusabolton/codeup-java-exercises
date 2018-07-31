package movies;
import util.Input;
//import java.util.Scanner;
//import movies.MoviesArray;
//import movies.Movie;

public class MoviesApplication {
    public static Input input = new Input();
    public static MoviesArray moviesArray = new MoviesArray();

    public static Movie[] movies = MoviesArray.findAll();

    public static void printMovies() {
        for (Movie movie : movies) {
            System.out.println(movie.getName() + " -- " + movie.getCategory());
        }
    }
    public static void printMovies(String category) {
        for (Movie movie : movies) {
            if (movie.getCategory().equals(category)) {

            System.out.println(movie.getName() + " -- " + movie.getCategory());}
        }
    }

        public static void main(String[] args) {
//viewing options

//ask for input//display user's input
            System.out.println(
                            "\n\n Welcome to Movie Night. \n\n\n"+
                            "0 - exit\n"+
                            "1 - view all movies\n"+
                            "2 - view movies in the animated category\n"+
                            "3 - view movies in the drama category\n"+
                            "4 - view movies in the horror category\n"+
                            "5 - view movies in the scifi category\n"
            );
            System.out.println(input.getString("Which movie do you want to see? Enter your selection"));


//if selcts category, display only movies from that category
//app runs until user exits
        int userInt = input.getInt();

        if (userInt == 1) {
//return whole list from MoviesArray.java

            System.out.println("View all the movies." );
            printMovies();
        } else if ((userInt == 2)) {
//return ANIMATED CATEGORY list
            printMovies("animated");
            System.out.println("view movies in the ANIMATED category");

        }
        else if ((userInt == 3)) {
//return DRAMA CATEGORY list
            System.out.println("view movies in the DRAMA category");
            printMovies("drama");
        } else if ((userInt == 4)) {
//return HORROR CATEGORY list
            System.out.println("view movies in the HORROR category");
            printMovies("horror");


        } else if ((userInt == 5)) {
//return SCIFI CATEGORY list
            System.out.println("view movies in the SCIFI category");
            printMovies("scifi");

        } else if ((userInt == 0)) {
//exit application
            System.out.println("Thank you for playing.");


        } else {
            System.out.println("Not valid.");
        }

    }
}
//////Sample Output
//////What would you like to do?
//////
//////        0 - exit
//////        1 - view all movies
//////        2 - view movies in the animated category
//////        3 - view movies in the drama category
//////        4 - view movies in the horror category
//////        5 - view movies in the scifi category
//////
//////        Enter your choice: 1
//////
//////        Frankenstein -- horror
//////        Goodfellas -- drama
//////        Pulp Fiction -- drama


