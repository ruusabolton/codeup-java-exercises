import java.sql.SQLOutput;

public class PersonTester {

    public static void main (String [] args){
        Person person1 = new Person();//creates a copy of the blueprint(Person class)
        Person person2 = new Person();
//changes the name variable's empty value to "john"
        person1.setName("John");
        System.out.println(person1.getName());


        person1.getName();
        person2.setName("John");
//        Person person2 = new Person("John");
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);
        System.out.println(person2 == person1);
        System.out.println(person1.getName());
        person2.setName("Jane");
        System.out.println(person2.sayHello());
        System.out.println(person1.getName());
        System.out.println(person2.getName());
         //calling sayHello() method applying name of person2
    }



}
