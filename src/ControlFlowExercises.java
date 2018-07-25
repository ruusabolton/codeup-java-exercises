
public class ControlFlowExercises {
    public static void main(String[] args) {


        long powerOfTwo= 2;


        do {
            System.out.println(powerOfTwo);   // print out the power of two
            powerOfTwo = powerOfTwo * powerOfTwo;  // double to get the next one

            // repeat until i equals n

        } while (powerOfTwo <= 1000000);
    }}