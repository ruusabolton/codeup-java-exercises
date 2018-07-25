import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    System.out.print("Talk to Bob and say something");
    String userQuestion = sc.next();

//    String userQuestion = "";
    if(userQuestion.endsWith("?")){
        System.out.println("sure");
    }else if(userQuestion == userQuestion.toUpperCase()){
        System.out.println("Whoa, chill out!");

    }else if(userQuestion == " "){
        System.out.println("Fine. Be that way!");

    }else{
        System.out.println("Whatever");
        }


}
}