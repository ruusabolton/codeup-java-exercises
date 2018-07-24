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

        //DO LOOP
//        number = 1;
//      do{
//          if(number == 10){
//              condition = false;
//          }
//          System.out.println(number);
//          number ++;
//
//      } while (condition);


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
