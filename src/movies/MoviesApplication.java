package movies;
//IMPLEMENTOR

import util.Input;


public class MoviesApplication {

//CREATE NEW INSTANCES FOR THE CLASSES THAT YOU ARE IMPORTING
    public static Input input = new Input();

    public static MoviesArray moviesArray = new MoviesArray();

//static method MoviesArray makes it impossible to run; so create a copy of the movie list.
// Other alternative is to remove static in method but that can break something else.
    public static Movie[] movies = MoviesArray.findAll();

//ENHANCED FOR LOOP:
// Movie = the class that created blueprint object, movie=item of the class, target = movies (list of movies - copy we created of array)
//loop is foing to ask each item (movie) in target (movies) for its name and category, and return each.
// Loop will also use getName and getCategory to accomplish that.
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
//MAIN METHOD TO TEST CONSTRUCTORS & CLASSES
        public static void main(String[] args) {
//viewing options
//ask for input//display user's input

            System.out.println("\n\n Welcome to Movie Night. \n\n What would you like to do?");

            System.out.println(

                            "0 - exit\n"+
                            "1 - view all movies\n"+
                            "2 - view movies in the animated category\n"+
                            "3 - view movies in the drama category\n"+
                            "4 - view movies in the horror category\n"+
                            "5 - view movies in the scifi category\n"
            );
//call getInt from Input.java to get input from user
//if selects category, display only movies from that category
        int userInt = input.getInt();

        if (userInt == 1) {
//return whole list from MoviesArray.java

            System.out.println("View all the movies." );
            printMovies();
        } else if (userInt == 2) {
//return ANIMATED CATEGORY list
            printMovies("animated");
            System.out.println("view movies in the ANIMATED category");

        }
        else if (userInt == 3) {
//return DRAMA CATEGORY list
            System.out.println("view movies in the DRAMA category");
            printMovies("drama");
        } else if (userInt == 4) {
//return HORROR CATEGORY list
            System.out.println("view movies in the HORROR category");
            printMovies("horror");


        } else if (userInt == 5) {
//return SCIFI CATEGORY list
            System.out.println("view movies in the SCIFI category");
            printMovies("scifi");

        } else if (userInt == 0) {
//exit application
            System.out.println("Thank you for playing.");
            System.exit(0);

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


