package abstractPractice;

abstract class Employee {
//can have regular methods as well as abstract methods
//abstract method is a method that is declared without an implementation
//thereby forcing subclasses to create their indiv implementations


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
//    public Employee(String name, String department) {
//        this.name = name;
//        this.department = department;
//    }


}