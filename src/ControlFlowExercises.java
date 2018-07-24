public class ControlFlowExercises {
    public static void main(String[] args) {

        boolean condition = true;
        int i = 5;
        while (condition) {//must use some form of comparison otherwise you will get an infinite loop

            if (i == 15) {
                condition = false;
            }
            System.out.println(i);
            i++;
        }


    }
}
