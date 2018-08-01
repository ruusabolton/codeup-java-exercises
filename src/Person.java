public class Person {

    //CLASS PERSON IS THE BLUEPRINT - DOES NOT NEED A MAIN METHOD!! MAIN MEETHOD WILL BE IN THE TESTING CLASS!

////unique properties for each person individually
//    public String firstName;
//    public String lastName;
////class property - available to all clas objects
//    public static long world_population = 300_000_000L;

    // String= "dsgfalsdgj" = intializing

    private String name;//modifier = private; datatype + String;
//to give access to the private name, create getName & setName

    //constructor
    public String getName(){
        return this.name;
    }
//initializing the name to be used in getName; since nothing is expected in return, also use void
//this = this class
    public void setName(String name){
        this.name = name;
        }

    public String sayHello(){
        return "Hello, hello " + this.name + ". Turn the radio on.";
    }

    private int age;
    public static void progressOneYear(Person[] people) {
        for (Person person : people) {
            person.setAge(person.getAge() + 1);
        }
    }

    public static void printOutAgesOfPeople(Person[] people) {
        for (Person person : people) {
            System.out.println(person.getAge());
        }
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
