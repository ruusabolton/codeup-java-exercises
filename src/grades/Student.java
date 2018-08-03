package grades;

import java.util.ArrayList;


public class Student {
//initialize class properties/objects
    private String name;
    // The grades property should be an list of integers.
    private ArrayList<Integer>grades;

//CONSTRUCTOR to create name and grade
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();

    }

//Empty ArrayList

//METHODS TO GET & SET NAME & GRADE VALUES
// returns the student's name

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

// adds the given grade to the grades property

    public void addGrade( int grade){
        grades.add(grade) ;
        };


//returns the average of the students grades
    public  double getGradeAverage() {
        int total = 0;
    for(int grade : grades) {
     total += grade;
    } return total/grades.size();
    }

//////////////////////////////////////////////////////////
    public static void main(String[] args) {
//CREATE NEW ARRAYLIST
        Student student1 = new Student("sally");
        student1.addGrade(80);
        student1.addGrade(70);
        student1.addGrade(70);


//PRINTING ARRAYLIST
        System.out.println("Printing populated ArrayList: \n" + student1.getGradeAverage());


    }

}


