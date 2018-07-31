import java.util.Collections;
import java.util.Scanner;
public class MethodsExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//TESTING + PRINT INSIDE OF MAIN
//exercise 1
//        int addNumbers = addNumbers(3, 4);
        int subtractNumbers = subtractNumbers(10, 4);
        int multiplyNumbers = multiplyNumbers(12, 2);
        int divideNumbers = divideNumbers(25, 5);
        int modulusNumbers = modulusNumbers(21, 4);


        System.out.println("After add: " + addNumbers(3, 4));
        System.out.println("After subtract: " + subtractNumbers);
        System.out.println("After multiply: " + multiplyNumbers);
        System.out.println("After divide: " + divideNumbers);
        System.out.println("Remainder Modulus: " + modulusNumbers);

//exercise 2
        System.out.println("Enter a number between 1 and 10: ");
        int userInput = getInteger(1, 10);
        System.out.println("Your integer is: " + userInput);

//exercise 3
        System.out.println("Enter your number between 1 and 10: ");
        int number = sc.nextInt(); //to read the inputted value
        System.out.printf("Factorial entered: " + calculateFactorial(number));

    }

    //EXERCISES OUTSIDE OF MAIN
    //EX1
    public static int addNumbers(int c, int d) {
        int x = c + d;
        return x;
    }

    public static int subtractNumbers(int c, int d) {
        int y = 0;
        y = c - d;
        return y;
    }

    public static int multiplyNumbers(int a, int b) {
        int v = a * b;
        return v;

    }

    public static int divideNumbers(int c, int d) {
        int w = 0;
        w = c / d;
        return w;
    }

    public static int modulusNumbers(int c, int d) {
        int z = 0;
        z = c % d;
        return z;
    }

    //EX2
    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        boolean getInteger = true;

        if (!sc.hasNextInt()) {
            System.out.println("Not a number!");
            return getInteger(min, max);
        }
        int userInput = sc.nextInt();
        if (userInput >= min && userInput <= max) {
            return userInput;
        } else {
            System.out.println("Number not in range!");
            return getInteger(min, max);
        }
    }
    //EX3

    public static int calculateFactorial(int number) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your number between 1 and 10: ");
        number = sc.nextInt(); //to read the inputted value

        int factorial = 1;
        int count;



        System.out.println();

        if (number>0 && number<10)
        {
            for (count=1; count<=number; count++){

                factorial *= count;
                System.out.println("Factorial of  %d! = %d% "+number + " x "+ count +   factorial + number);

                System.out.println();
            }
        }
        else
        {
            System.out.println("Enter a positive whole number greater than 0 but less than 10");
            System.out.println();
            return calculateFactorial(number);//restart method
        }
        return factorial;

    }
}







