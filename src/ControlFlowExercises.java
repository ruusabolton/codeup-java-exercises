
public class ControlFlowExercises {
    public static void main(String[] args) {


        for (int i = 0; i <= 100; i += 1) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz"); //number is divisible by 3, print Fizz
            } else if (i % 5 == 0) {
                System.out.println("Buzz");

            } else if (i % 3 == 0) {
                System.out.println("Fizz");//numbers which are multiples of both three and five
            } else {
                System.out.println(i); //otherwise print number starting from 1 to 100 (less than the fiss, buzz, fizzbuss numbers)
            }
        }
    }
}