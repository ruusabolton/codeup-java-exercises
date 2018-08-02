package abstractPractice;
//class Accountant must either be declared abstract
//OR implement abstract method 'work' in Employee.java

public class Accountant extends Employee {

//    Accountant(){
//        super("Ms Katy", "Accounting");
//    }
//IMPLEMENTING work method
//of more than 1 abstact method, must implement ALL

        public String work () {
        return "to count the money";
        }

//    public String quit () {
//        return "to count the money";
//    }
}