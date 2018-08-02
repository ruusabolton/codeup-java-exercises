package abstractPractice;

public class EmployeeTester {
    public static void main(String[] args) {
        //because of polymorphism Class can be Employee or child-class Manager/Dev/Accountant
        Manager manager = new Manager();
        Employee accountant = new Accountant();
        Employee developer = new Developer();

        System.out.println("Manager's job is "+ manager.work());
        System.out.println("Accountant's job to "+accountant.work());
        System.out.println("Developer's job to "+developer.work());
        System.out.println("Manager's name is "+manager.getName());
        System.out.println("Developer's name is "+developer.getName());
        System.out.println("Accountant's name is "+accountant.getName());


        PowerControllable mic = new Mic();
        PowerControllable janitor = new Janitor();
//       System.out.println(PowerControllable.PowerOn());

        PowerControllable[]devices = {mic, janitor};
        setUpClassroom(devices);
    }

    public static void setUpClassroom(PowerControllable[] devices) {
        for (PowerControllable device : devices) {
            device.powerOn();
            device.powerOff();
        }
    }
}

