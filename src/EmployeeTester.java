public class EmployeeTester {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Accountant accountant = new Accountant();
        Developer developer = new Developer();

        System.out.println("Manager's job is "+ manager.work());
        System.out.println("Accountant's job to "+accountant.work());
        System.out.println("Developer's job to "+developer.work());
        System.out.println("Manager's name is "+manager.getName());
        System.out.println("Developer's name is "+developer.getName());
        System.out.println("Accountant's name is "+accountant.getName());


    }
}
