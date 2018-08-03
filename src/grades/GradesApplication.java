package grades;
import java.util.HashMap;


public class GradesApplication {
    public static void main(String[] args) {
initApp();}


public static void initApp(){

            HashMap<String, Student> students = new HashMap<>();
//adding more students objects
            Student student1 = new Student("sally");
            student1.addGrade(80);
            student1.addGrade(72);
            student1.addGrade(77);

            Student student2 = new Student("susan");
            student2.addGrade(100);
            student2.addGrade(28);
            student2.addGrade(78);

            Student student3 = new Student("simone");
            student3.addGrade(80);
            student3.addGrade(92);
            student3.addGrade(71);

            Student student4 = new Student("sarrah");
            student4.addGrade(80);
            student4.addGrade(65);
            student4.addGrade(74);

//Hashmap = students; key = a123, value=student1
//creating hash key value pair
            students.put("as1f2n3", student1);
            students.put("bb1p2w3", student2);
            students.put("cd1r2t3", student3);
            students.put("dq1w2q3", student4);
            System.out.println(students.size());//will print 4

//calling on hash key/value to target a specific student's information such as name or grade average
    System.out.println(students.get("as1f2n3").getGradeAverage());
    System.out.println(students.get("cd1r2t3").getName() +" " + students.get("c123").getGradeAverage());



    }
}
