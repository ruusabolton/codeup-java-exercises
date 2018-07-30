package util;

import java.util.Scanner;


public class Input {


    private Scanner scanner;
    public Input (){
        scanner  = new Scanner(System.in);
    }


//    String getString()
    public String getString (){
        return scanner.nextLine();
    }

//    boolean yesNo()
//The yesNo method should return true if the user enters y, yes, or variants thereof, and false otherwise.
public boolean yesNo(){
    String userResponse = scanner.nextLine();
    if (!userResponse.equalsIgnoreCase("yes")){
        return true;
    }else if(!userResponse.equalsIgnoreCase("y")){
        return true;
    }else{
        return false;
    }

}

//    int getInt(int min, int max)
public Integer getInt(int min, int max){
return min + max;
}
//public Integer getInt(){
//
//    }
//    int getInt()
//The getInt(int min, int max) method should keep prompting the user for input until they give
//an integer within the min and max. The getDouble method should do the same thing, but with decimal numbers.

//    double getDouble(double min, double max)
public double getDouble (double min, double max){
return min + max;
}

//    double getDouble()

}
