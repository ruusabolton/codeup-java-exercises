//class Developer must either be declared abstract
//OR implement abstract method 'work' in Employee.java
class Developer extends Employee{

    Developer(){
        super("JonBoy", "IT");
    }

//IMPLEMENTING work method


    public String work(){
        return "to write code";
    }
}