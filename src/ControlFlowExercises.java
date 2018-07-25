public class ControlFlowExercises {
    public static void main(String[] args) {

        boolean condition = true;
//        Alter your loop to count backwards by 5's from 100 to -10.
        //
        int number = 100;
          do{
              if(number == -10){
                  condition = false;
              }
              System.out.println(number);
              number -=5;

          } while (condition);
    }
}
