public class HelloWorld {
    public static void main(String[] args){
       //1. Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
        int myFavoriteNumber = 27;

        //2. Create a String variable named myString and assign a string value to it, then print the variable out to the console.
        String myString = "the world is round.";

        //3. Change your code to assign a character value to myString. What do you notice?
        //String myString1 = '3'; //ERROR of incompatible types

        //4. Change your code to assign the value 3.14159 to myString. What happens?
        String myString2 = "3.14159"; //Error of incompatible types

        //5. Declare an long variable named myNumber, but do not assign anything to it.
        // Next try to print out myNumber to the console. What happens?
        long myNumber; //got ERROR "variable might not have been initialized"

        //6. Change your code to assign the value 3.14 to myNumber. What do you notice?
//        myNumber = 3.14l; //ERROR "incompatible types; require long, found double"
        //7. Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
        myNumber = 123L; //prints 123 (with or without the L)

        //8. Change your code to assign the value 123 to myNumber.
        //Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?

        // -- the decimal indicates a double data type. Without the decimal, it becomes an object that can be a number (not a prim type of integet)

        //9. Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
        long myNumber1 = 123;
        float changeNum = (float)myNumber1;
        //changeNum = 3.14; //ERROR incompatible types (float & double); SOLN: change long to double before changing to float;

        long MyNumber2 = 123;
        double chagnedNum = (double)MyNumber2;
        chagnedNum = 3.14;

        //10. Copy and paste the following code blocks one at a time and execute them
        int x = 5;


        //11.Try to create a variable named class. What happens?
//        long class = 09770; //ERROR: identifier expected

        //12. Rewrite the following expressions using the relevant shorthand assignment operators:
//        int x = 4;
//        x = x + 5;

        int xx = 4;
        xx += 5;

//        int x = 3;
//        int y = 4;
//        y = y * x;

        int xxx = 3;
        int y = 4 * xxx;

//        int x = 10;
//        int y = 2;
//        x = x / y;
//        y = y - x;

        int x1 = 10; //prints 9
        int y1 = 2; //prints 12
        y1 -= x1; //prints 5
        x1 /= 2; //prints -8

        //PRINT
        System.out.println("Hello, World!");

        //1.
        System.out.println("My favorite number is " + myFavoriteNumber);
        //2.
        System.out.println("My psychologist said yesterday  " + myString);
        //4.
        System.out.println(myString2);//no errors,it printed
        //5.
        System.out.println(myNumber);
        //6.
        //ERROR: "incompatible types; require long, found double"
        //7.
        System.out.println(myNumber);
        //8.
        // -- the decimal indicates a double data type. Without the decimal, it becomes an object that can be a number (not a prim type of integet)

        //9.
        System.out.println(changeNum);
        System.out.println(chagnedNum);

        //10.
        System.out.println(x++);//prints 5
        System.out.println(x); //prints 6
        System.out.println(++x); //prints 7
        System.out.println(x);//prints 7

        //11.
            //ERROR: identifier expected

        //12.
        System.out.println(xx);
        System.out.println(y);
        System.out.println(x1);
        System.out.println(y1);
    }
}
