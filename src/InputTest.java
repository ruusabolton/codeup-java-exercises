import java.util.Scanner;

public class InputTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//getString
        boolean getString = true;

        System.out.print("Do you want to enter another grade (y/n)? ");
        String userResponse = sc.nextLine();
        if (!userResponse.equalsIgnoreCase("yes")) {
            getString = false;
        }
////yesNo
//util.Input.yesNo(userResponse);
//        System.out.println(util.Input.yesNo());

 }


}



