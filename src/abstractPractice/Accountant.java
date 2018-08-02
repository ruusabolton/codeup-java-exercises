package abstractPractice;
//class Accountant must either be declared abstract
//OR implement abstract method 'work' in Employee.java

public class Accountant extends Employee {

//geforseer om super te verklaar - andersins sien jy 'n rooi lyn
//by Employee.java moet die public Employee(String name, String department) oop wees. (Gaan hand aan hand)
//Om hierdie probleem te vermy, blok bogenoemde instans en blok ook die verwysing na die super in elke Employee tipe.

        Accountant(){
        super("Ms Katy", "Accounting");
    }

//IMPLEMENTING work method
//of more than 1 abstact method, must implement ALL

        public String work () {
        return "to count the money";
        }

//    public String quit () {
//        return "to count the money";
//    }
}