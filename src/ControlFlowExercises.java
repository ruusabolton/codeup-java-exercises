
public class ControlFlowExercises {
    public static void main(String[] args) {

//        boolean condition = true;
//  Create a do-while loop that starts at 2,
// and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//        2
//        4
//        16
//        256
//        65536
        //
        int i = 2;
        int powerOfTwo = i ;


          do {
                  System.out.println(powerOfTwo);   // print out the power of two
                  powerOfTwo = powerOfTwo * powerOfTwo;  // double to get the next one

              // repeat until i equals n

              i++;
         } while (i<=1000000);
    }
}



