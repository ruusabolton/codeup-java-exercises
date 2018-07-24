import java.util.Scanner;

public class ConsoleExercises {

    public static void main (String [] args){
//        //1.Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
//        //datatype = Scanner; variable = sc
        Scanner sc = new Scanner(System.in);
//        //what are you looking for/what do you want to return - will determine which next() method to use
//        //nextLine asks a yes/no question
//        //save it to a variable otherwise it gets lost.
//        //What happens if you input something that is not an integer? runtime ERROR

        System.out.println("What is your name? ");
        System.out.println("Your name is " + sc.nextLine());

        System.out.println("What is your age? ");
        int age = sc.nextInt();
        sc.nextLine();//to give break before asking the next question.
        System.out.println("Your age is " + age);

//        //2.Prompt a user to enter 3 words and store each of them in a separate variable, then display them back, each on a newline.
//        //
//        //What happens if you enter less than 3 words?
//        //What happens if you enter more than 3 words?
//
//        System.out.println("What is your first word? ");
//        String word1 = sc.nextLine();
//        System.out.println("What is your second word? ");
//        String word2 = sc.nextLine();
//        System.out.println("What is your third word? ");
//        String word3 = sc.nextLine();
//
//        System.out.printf("Your words:  %s %s %s", word1, word2, word3);


        //3.Prompt a user to enter a sentence, then store that sentence in a String variable using the .next method, then display that sentence back to the user.
        //
        //do you capture all of the words?
        System.out.println("Your sentence ");
//        String sentence = sc.next(); //will print the first word before a white space

        //Rewrite the above example using the .nextLine method.
        String sentence = sc.nextLine();//will print everything
       System.out.println(sentence);

       //1.Prompt the user to enter values of length and width of the classroom.
        //
        //Use the .nextLine method to get user input and cast the resulting string to a numeric type.
        //
        //Assume that the rooms are perfect rectangles.
        //Assume that the user will enter valid numeric data for length and width.

        System.out.println("Give the room's length:  ");
        String length = sc.nextLine();
        System.out.println("Give the room's width:  ");
        String width = sc.nextLine();

        double area = Double.parseDouble(length) * Double.parseDouble(width);

        //2. Display the area and perimeter of that classroom.
        //
        //
        //area = length x width
        //perimter = 2 x length + 2 x width

        System.out.println(area + "= " + length + " x " + width );
        double perimeter = 2 * Double.parseDouble(length) + (2 * Double.parseDouble(width));
        System.out.println(perimeter + "= 2x" + length + " + 2x" + width);






    }




}
