package grades;
import util.Input;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
/*1.*/
    public static Input input;
/*2.*/
    public static void main(String[] args) {
        initApp();
    }

/*3.*/
//will run at the beginning
    public static void initApp() {
        HashMap<String, Student>students = populateData();
        System.out.println(returnWelcomeMessage(students));
        input = new Input();//pulling methods from Input.java
        boolean willContinue = true; //creating boolean for continuation of do-while loop

//DO-WHILE TO GET USER INPUT
        do{
            String choice = input.getString("What student would you like to see more information on?");
            //if-else checks that user entry matches keySet, if  not, quetion runs again.
            if(students.containsKey(choice) || students.containsValue(choice)) {

                System.out.println("Name: " + students.get(choice).getName() + "\nCurrent Average: " +
                        students.get(choice).getGradeAverage());
              System.out.println("Printing Array of all grades: \n" + students.get(choice).getGrade());
                System.out.println("Will you continue?");
            }else{
                System.out.println("Sorry, no student found with the GitHub username of "+ choice);
            }
        willContinue = input.yesNo();//yesNo-method has prompts and expects defined responses
        } while(willContinue); //loop will run as long as willContinue remains true, i.e. user enter YES;.
        //if-statment - in case user enter NO;
        if(!willContinue){
            System.out.println("Goodbye, and have a wonderful day!");
        }
    }


/*4.*/
//CREATES UTPUT VAR TO STORE DISPLAY CONSTANT MESSAGE AND DYNAMIC KEYS
    public static String returnWelcomeMessage(HashMap<String, Student> students){
        String output = "";//empty string to store output values - can accommodate changing values
        output += "Welcome!\n\n";
        output += "Here are the GitHub usernames of our students: \n\n";
        for (String key : students.keySet()){
            output += "|" + key + "|";
        }

        // trims the trailing and leading spaces
        return output.trim();
    }

/*5.*/
//CREATES HASHMAP, KEYS & VALUES, POPULATES THE HASHMAP
    public static HashMap<String, Student> populateData(){
//Create New HashMap on the Student called students
        HashMap<String, Student> students = new HashMap<>();
//adding more students objects
        Student student1 = new Student("Sally");
        student1.addGrade(80);
        student1.addGrade(72);
        student1.addGrade(77);

        Student student2 = new Student("Susan");
        student2.addGrade(100);
        student2.addGrade(28);
        student2.addGrade(78);

        Student student3 = new Student("Simone");
        student3.addGrade(80);
        student3.addGrade(92);
        student3.addGrade(71);

        Student student4 = new Student("Sarah");
        student4.addGrade(80);
        student4.addGrade(65);
        student4.addGrade(74);

////Hashmap = students; key = a123, value=student1
////creating hash key value pair
        students.put("as1f2n3", student1);
        students.put("bb1p2w3", student2);
        students.put("cd1r2t3", student3);
        students.put("dq1w2q3", student4);

////calling on hash key/value to target a specific student's information such as name or grade average
//        System.out.println(students.get("as1f2n3").getGradeAverage());
//        System.out.println(students.get("cd1r2t3").getName());

        return students;

    }
}
