package abstractPractice;

public abstract class Employee {
//can have regular methods as well as abstract methods
//abstract method is a method that is declared without an implementation
//thereby forcing subclasses to create their indiv implementations

//geforseer om super te verklaar - andersins sien jy 'n rooi lyn
//by Employee.java moet die public Employee(String name, String department) oop wees. (Gaan hand aan hand)
//Om hierdie probleem te vermy, blok bogenoemde instans en blok ook die verwysing na die super in elke Employee tipe.

    //ABSTRACT METHOD - if more than 1 abstract method, must implement ALL in subclasses
    public abstract String work();
//    public abstract String quit();


// REGULAR METHODS


    private String name;
    private String department;


    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }
    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }


}