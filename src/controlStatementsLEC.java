public class controlStatementsLEC {

    public static void main(String[] args) {
        //BOOLEAN EXPRESSIONS
////        discountPercent == 2.3;       // equal to a numeric literal
////        letter == 'y' ;               // equal to a char literal
////        isValid == false ;            // equal to the false value
////        subtotal != 0  ;              // not equal to a numeric literal
////        loggedInUser != accountOwner; // not equal to a variable
////        years > 0 ;                   // greater than a numeric literal
////        i < months;                   // less than a variable
////        subtotal >= 500  ;            // greater than or equal to a numeric literal
////        quantity <= reorderPoint ;    // less than or equal to a variable
//
//        boolean isLoggedIn = true;
//        boolean isAdmin = false;
//
//        if (isLoggedIn && isAdmin) { //if your're logged in or are an Admin
//            System.out.println("show the admin menu");
//
//        } else if (isLoggedIn || isAdmin) { //if your're logged in or are an Admin
//
//            System.out.println("show the index page");
//        } else {
//
//            System.out.println("you can't see this page!");
//        }
////if you are not logged in
//        if (!isLoggedIn) {
//            System.out.println("redirect to login page");
//        }
//
//        String name = "fer";
//        if (name.equals("fers")) {
//            System.out.println("Your name matches ");
//        } else {
//            System.out.println("your name doesn't matck.");
//        }
//
//        String lname = "diro";
//        if ("diro".equals(lname)) {
//            System.out.println("your last name matches ");
//
//        } else {
//            System.out.println("your last name doesn't matck.");
//        }
//
//        int grade = 80;
//        switch (grade) {
//            case 50:
//                System.out.println("With 50 - you need more");
//                break;
//            case 60:
//                System.out.println("With 60 - you need less more");
//                break;
//            case 70:
//                System.out.println("With 70 - you are there");
//                break;
//            case 80:
//                System.out.println("With 80 - you did it");
//                break;
//            default:
//                System.out.println("INVALID - you never had a chance");
//                break;
//        }

//WHILE STATEMENT - MUST PRINT 10 NUMBERS

        boolean condition = true;
        int number = 0;
//        while (condition){//must use some form of comparison otherwise you will get an infinite loop
//            number ++;
//            if(number ==10){
//                condition = false;
//            }
//            System.out.println(number);
//
//        }


        //Create a while loop that runs so long as i is less than or equal to 15
//        boolean condition = true;
//        int i = 5;
//        while (condition) {//must use some form of comparison otherwise you will get an infinite loop
//
//            if (i == 15) {
//                condition = false;
//            }
//            System.out.println(i);
//            i++;
//        } //will output 5,6,7,8,9,10,11,12,13,14,15





        //DO WHILE LOOP
//        number = 1;
//      do{
//          if(number == 10){
//              condition = false;
//          }
//          System.out.println(number);
//          number ++;
//
//      } while (condition);


//        boolean condition = true;
//        //Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        //
//        int number = 0;
//        do{
//            if(number == 100){
//                condition = false;
//            }
//            System.out.println(number);
//            number +=2;
//
//        } while (condition);
//    }

//        boolean condition = true;
////        Alter your loop to count backwards by 5's from 100 to -10.
//        //
//        int number = 100;
//        do{
//            if(number == -10){
//                condition = false;
//            }
//            System.out.println(number);
//            number -=5;
//
//        } while (condition); //will count bacwards from 100 to -10 in 5 increments, e.g. 100, 95, 90, 85 ..., 0, -5, -10


////  Create a do-while loop that starts at 2,
//// and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
////        2
////        4
////        16
////        256
////        65536
//        //
//        int i = 2;
//        int powerOfTwo = i ;
//
//
//        do {
//            System.out.println(powerOfTwo);   // print out the power of two
//            powerOfTwo = powerOfTwo * powerOfTwo;  // double to get the next one
//
//            // repeat until i equals n
//
//            i++;
//        } while (i<=1000000);



//FOR LOOP
//        for (int i = 1; i <= 10 ; i++){
//            System.out.println("i = " + i);;
//
//        }

//BREAK & CONTINUE

//  print the numbers 1 through 5
//        for(int i = 1; i < 10; i++) {
//            System.out.println(i);
//            if (i == 5) {
//                break; // --------------+STOP HERE
//            }//will print 1-5
//
//        }

// print the even numbers between 1 and 10
        for(int i = 1; i <= 10; i++) { // <--+
            if(i % 2 == 1) { //              |
                continue; // ----------------+
            }
            System.out.println(i);
        }//will print 2,4,6,8,10
//Using continue to skip a parameter
//if(i==8){continue}System.out.println(i); //will print everything EXCEPT 8;
//if(i==8 || i == 4){continue}System.out.println(i); //will print everything EXCEPT 4 & 8;

    }
}
