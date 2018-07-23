public class syntaxLEC {

    public static void main(String[] args){
        int number;
        number = 5;//int range is -2,147,483,648 to 2,147,483,647
        byte rating = 5;//because rting range is 1-5: bytes for int from -128 to 127; accepts only numbers
        boolean isStateInspectionDone = true; //boolean values are either true or false;
        short venueCount = 12000; //if number of venues are max 12000: must be within range of -32768 to 32767
        float price=35.45f; //f for float, otherwise the decimal indicates a double datatype
        double grade = 89.23; //Double-precision, floating-point numbers from -1.7E308 to 1.7E308 with up to 16 significant digits
        long Alamodome = 554354533l; //can be with or without l; l designates a reference type and not a data type;Long integers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        char initialFN = 'f'; //single quotes for a single char; double quotes for more than one characters
        char gender = 'f';//can accept numbers and characters
        String name = "fer"; //capitalize String and use "" for strings with more than 1 characters.

        //USING ESCAPE
        String owner = "fer\'S MAC"; //capitalize String and use "" for strings with more than 1 characters.

        //variables

        //1. declare:  type variableName
        //2. initialize: variableName = value;

        //long way around
        int theAnswer;
        String question;
        theAnswer = 42;
        question = "What is your fav color? ";

        //declare and initialize at the same time
        int theAnswer1 = 50;
        String question1 = "What is your fav number? ";

        //CONSTANTS
        // constants: to store value that cannot change as program executes
        //preceded by final and can capitalize all letters in the name of the variable (makes for easy identificaiton of constants
        //e.g. final int SIDES_OF_A_DICE = 6; BUT WILL NOT CHANGE THE FUNCTIONALITY IF NOT CAPITALIZED

        final int PAGES = 10;

        //ARITHMETIC EXPRESSIONS
        //mostly same as in JS
        int myNumber = 12+12*2;
        myNumber += 9; //myNumber = myNumber + 9; = 45

        //CASTING
 //use alternating of ++
//        rating ++; //will increment by 1 the existing rate value ( now rate is 6)
//        rating --; //will decrement by 1 the existing rate value (now rate is 4 (remember to comment out rating ++, otherwise rating reverts back to 5; 6-1=5)
        rating += 123; //current rating //if it goes over 128 than it will give back funky numbers

        //EXPLICIT CASTING

        //uses parentheses to specify data type
        //called narrowing conversion

        double pi = 3.14159;
        int almostPi = (int) pi; //will print that portion that is more specific, nl 3; changes double to int

        float populationPercent = 81.35f;
        byte chartVanilla = (byte) populationPercent; //changes float to byte

        System.out.println("price = " + price); //will print price = 35.45
        System.out.println("grade= " + grade); //will print grade = 89.23
        System.out.println("number = " + number +" and " + isStateInspectionDone); //will print 5 true
        System.out.println("long = " + Alamodome); //lwill print ong = 554354533
        System.out.println("long = " + Alamodome); //will print long = 554354533
        System.out.println("char = " + initialFN); //will print char = f
        System.out.println("char = " + gender); //will print char = f
        System.out.println("String = " + name); //will print String = fer
        System.out.println("String = " + owner); //will print String = fer's MAC
        System.out.println(question1 + "Is it " + theAnswer1); //will print String = fer's MAC
        System.out.println("Total pages in my book: " + PAGES);
        System.out.println(myNumber);//will print 45 (12*2= 24 + 12= 36 +9 =45)
        System.out.println("total = "  + price + grade + myNumber); //will concatenate values!! total = 35.4589.2345
        System.out.println("total = "  + (price + grade + myNumber)); //will returm addition sum: total = 169.68000076293947
        System.out.println(rating);

        System.out.println(pi); //will print 3.14159
        System.out.println(almostPi); //will print 3
        System.out.println(chartVanilla); //will print 81


    }

}
