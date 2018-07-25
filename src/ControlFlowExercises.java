public class ControlFlowExercises {
    public static void main(String[] args) {

        boolean condition = true;
        //Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
        //
        int number = 0;
          do{
              if(number == 100){
                  condition = false;
              }
              System.out.println(number);
              number +=2;

          } while (condition);
    }
}
