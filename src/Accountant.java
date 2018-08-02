//class Accountant must either be declared abstract
//OR implement abstract method 'work' in Employee.java

public class Accountant extends Employee {

    Accountant(){
        super("Ms Katy", "Accounting");
    }
//IMPLEMENTING work method

        public String work () {
        return "to count the money";
        }

}