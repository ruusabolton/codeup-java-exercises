import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean anotherGrade = true;
        do {
            System.out.println("Enter a grade. ");
            int numericGrade = sc.nextInt();
            if (numericGrade >= 88) {
                System.out.println("A");
            } else if (numericGrade >= 80) {
                System.out.println("B");
            } else if (numericGrade >= 67) {
                System.out.println("C");
            } else if (numericGrade >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
            System.out.print("Do you want to enter another grade (y/n)? ");
            String userResponse = sc.next();
            if (!userResponse.equalsIgnoreCase("y")){
                anotherGrade = false;
            }
        } while (anotherGrade);
    }
}