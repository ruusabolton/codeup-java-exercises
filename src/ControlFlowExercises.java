import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

                boolean userContinues = true;
        do {
            System.out.println("Enter an integer? ");
            int userInt = sc.nextInt();
            for (int i = 1; i <= userInt; i += 1) {
                System.out.printf("%d %d %d\n", i, (i * i), (i * i * i));
            }
            System.out.print("Do you want to continue? ");
            String userResponse = sc.next();
            if (!userResponse.equalsIgnoreCase("y")){
                userContinues = false;
            }
        }while (userContinues) ;
    }
}