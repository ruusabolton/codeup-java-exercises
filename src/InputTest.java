import java.util.Scanner;
import util.Input;
import java.lang.*;

public class InputTest {

    public static void main(String[] args) {


        Input input = new Input();

//getString

        input.getString(); // one way of calling method; other ways are below.

//        System.out.println(input.getString());
        System.out.println(input.getString("What is your favorite drink? "));


//yesNo()
//        input.yesNo(); // one way of calling method; another way is below.
        System.out.println(input.yesNo());

//getInt(min, max)

        System.out.println(input.getInt());


//getInt()

        System.out.println(input.getInt());

//getDouble(min, max)
//        System.out.println(input.getDouble(43.43, 656.6));
//


        System.out.println(input.TernaryTester());


    }


}



