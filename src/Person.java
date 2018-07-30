public class Person {
//unique properties for each person individually
    public String firstName;
    public String lastName;
//class property - available to all clas objects
    public static long world_population = 300_000_000L;

    public String sayHello (){
        return "Hi. My name is " + firstName + " "+ lastName;
    }
}
