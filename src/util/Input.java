package util;
import java.lang.*;
import java.util.*;

import java.util.Scanner;

//used to set string standard, integer standards, boolean etc for future use.
public class Input {


    private Scanner scanner = new Scanner(System.in);//to be used by the constructors inside this Input class

//constructors

//    String getString()
    public String getString (String prompt){
        prompt = (prompt.isEmpty()) ? "Type: " : prompt; //if prompt's value is empty, return to original value'
        System.out.println(prompt);
        return this.scanner.nextLine().toLowerCase().trim();//return this class's scanner property
    }

    public String getString (){

        return this.getString( "Type a String of letters: ");//return this class's scanner property
    }
//    boolean yesNo()
//The yesNo method should return true if the user enters y, yes, or variants thereof, and false otherwise.

    public boolean yesNo(){
//uses some of the code from getString()
        String result = this.getString(  "Type yes or no (y/n):");//return this class's scanner property
        return (result.equals("y") || result.equals("yes"));
    }

//    int getInt(int min, int max)
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
//    int getInt()

//    public Integer getInt(){
//        System.out.println("Enter an integer(must be a number) : ");
//        int userInt;
//        if (!scanner.hasNextInt()) {
//            System.out.println("Not a number!");
//            return getInt();
//        }
//        userInt = scanner.nextInt();
//
//        if (userInt == (int)userInt && userInt>=0) {
//            return userInt;
//        } else {
//            System.out.println("That is not a valid integer. Try again!");
//            return getInt();
//        }
//    }
//The getInt(int min, int max) method should keep prompting the user for input until they give
//an integer within the min and max. The getDouble method should do the same thing, but with decimal numbers.

    public int getInt(int min, int max){
        int userInput = Integer.parseInt(this.getString("Enter a number between " + min + " and " + max));
        if(userInput < min || userInput > max){
            System.err.println("Number out of range");
            getInt(min, max);
        }
        return userInput;
    }
    public int getInt(){
        return Integer.parseInt(this.getString("Enter a number"));
    }
//    public double getDouble(double min, double max){
//        double userInput = Double.parseDouble(this.getString("Enter a decimal number between " + min + " and " + max));
//        if(userInput < min || userInput > max){
//            System.err.println("Decimal number out of range");
//            userInput = getDouble(min, max);
//        }
//        return userInput;
//    }
    public double getDouble(){
        return Double.parseDouble(this.getString("Enter a decimal number"));
    }
}



