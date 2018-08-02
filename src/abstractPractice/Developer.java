package abstractPractice;

//class Developer must either be declared abstract
//OR implement abstract method 'work' in Employee.java

//geforseer om super te verklaar - andersins sien jy 'n rooi lyn
//by Employee.java moet die public Employee(String name, String department) oop wees. (Gaan hand aan hand)
//Om hierdie probleem te vermy, blok bogenoemde instans en blok ook die verwysing na die super in elke Employee tipe.

public class Developer extends Employee{

    Developer(){
        super("JonBoy", "IT");
    }

//IMPLEMENTING work method


    public String work(){
        return "to write code";
    }


}
