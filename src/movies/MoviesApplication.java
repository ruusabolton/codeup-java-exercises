package movies;
import util.Input;
import java.util.Scanner;


public class MoviesApplication {


        public static void main(String[] args) {
            Input input = new Input();
//viewing options

            public String interAct(user){
            scanner = new Scanner(System.in);//to be used by the constructors inside this Input class

  //ask for input
            System.out.println(input.getString("Which movie do you want to see?"));

//display user's input

//if selcts category, display only movies from that category
//app runs until user exits
            int user = scanner.nextInt();

            if(!scanner.hasNextInt()){
                    System.out.println("Not valid.");
            return interAct(user) ;

                }
        if (user == 1) {
            System.out.println("View all the movies.");
//return whole list from MoviesArray.java
            return MoviesArray();
        } else if ((user == 2)){
            System.out.println("view movies in the ANIMATED category");
            System.out.println (Movie.get(i).getCategory("animated"));

//return ANIMATED CATEGORY list from MoviesArray.java
            return MoviesArray();
        } else if ((user == 3)){
            System.out.println("view movies in the DRAMA category");
            System.out.println (Movie.get(i).getCategory("drama"));

//return ANIMATED CATEGORY list from MoviesArray.java
            return MoviesArray();
        } else if ((user == 4)){
            System.out.println("view movies in the HORROR category");
            System.out.println (Movie.get(i).getCategory("horror"));

//return ANIMATED CATEGORY list from MoviesArray.java
            return MoviesArray();
        } else if ((user == 5)){
            System.out.println("view movies in the SCIFI category");
            System.out.println (Movie.get(i).getCategory("scifi"));

//return ANIMATED CATEGORY list from MoviesArray.java
            return MoviesArray();
        }
            }
        }
}
//    public Integer getInt(int min, int max){
//        System.out.println("Enter a number between 1 & 10: ");
//
//        if (!scanner.hasNextInt()) {
//            System.out.println("Not a number!");
//            return getInt(min, max);
//        }
//        int userInput = scanner.nextInt();
//        if (userInput >= 1 && userInput <= 10) {
//            return userInput;
//        } else {
//            System.out.println("Number not in range!");
//            return getInt(min, max);
//        }
//    }
//
//Sample Output
//What would you like to do?
//
//        0 - exit
//        1 - view all movies
//        2 - view movies in the animated category
//        3 - view movies in the drama category
//        4 - view movies in the horror category
//        5 - view movies in the scifi category
//
//        Enter your choice: 1
//
//        Frankenstein -- horror
//        Goodfellas -- drama
//        Pulp Fiction -- drama