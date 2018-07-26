import java.util.Scanner;
public class MethodsExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int addNumbers = addNumbers(3,4);
        int subtractNumbers = subtractNumbers(10,4);
        int multiplyNumbers = multiplyNumbers(12, 2);
        int divideNumbers = divideNumbers(25,5);
        int modulusNumbers = modulusNumbers(21,4);
        boolean getInteger = getInteger(1, 10);

        System.out.println(addNumbers);
        System.out.println(subtractNumbers);
        System.out.println(multiplyNumbers);
        System.out.println(divideNumbers);
        System.out.println(modulusNumbers);
        System.out.println(getInteger);


    }
            public static int addNumbers (int c, int d){
            int x = c + d;
            return x;
                }
            public static int subtractNumbers (int c, int d) {
            int y = 0;
            y = c - d;
            return y;
                }
            public static int multiplyNumbers (int a, int b){
                int v = a * b;
                return v;

            }
            public static int divideNumbers (int c, int d) {
                int w = 0;
                w = c / d;
                return w;
            }
            public static int modulusNumbers (int c, int d) {
                int z = 0;
                z = c % d;
                return z;
             }
            public static boolean getInteger(int min, int max){
                Scanner sc = new Scanner(System.in);
                boolean getInteger = true;

                System.out.print("Enter a number between 1 and 10: ");
                System.out.println("Enter an integer? ");
                   int userInput = sc.nextInt();

                    if(userInput > min && userInput < max) {
                        System.out.println("You entered a number within the speified range");
//                        userInput = getInteger(1, 10);
                        return true;
                    }else {
                        System.out.println("Please enter a valid number");
                        return false;
                             }
                    }
            }






