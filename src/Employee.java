abstract class Employee {
    private String name;
    private String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }
    public String getName(){
        return name;
        }
    public String getDepartment(){
        return department;
    }
//abstract method is a method that is declared without an implementation
//thereby forcing subclasses to create their indiv implementations

    protected abstract String work();

}
