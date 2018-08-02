import java.util.ArrayList;

public class CollectLEC {
    public static void main(String[] args) {
        int size = 8;
        int[] numbers = new int[size];
//        System.out.println(numbers[9]);//this one will break your app,
// because it's calling for more than what you allocated for!!
//        System.out.println("hello");//This one will also break your app because it's a String, not an int!!


        ArrayList<Integer> numbers2 = new ArrayList <>();
        numbers2.add(20);
        numbers2.add(0, 21);
        numbers2.add(22);
        System.out.println(numbers2);

    }
}
