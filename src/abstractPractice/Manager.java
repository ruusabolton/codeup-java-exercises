package abstractPractice;
//class Developer must either be declared abstract
//OR implement abstract method 'work' in Employee.java
public class Manager extends Employee {

//    Manager(){
//        super("Mr Jones", "Administration");
//    }

    //IMPLEMENTING work method

    public String work(){
        return "to hold meetings";
    }
}
