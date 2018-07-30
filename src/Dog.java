public class Dog {
    public String name;
    public String breed;
    //creating a static constant; cannot be changed in the app
    public static final String animalType = "Canine"; //type is canine for all entries and will never change (use of static is for values that will not change)
    public boolean canBreed;
    public int age;

    //can call the dog
    public void callDog(String name){
        if (name.equalsIgnoreCase(this.name)){
            System.out.println(this.name+ " is walking toward u...");
        }else{
            System.out.println(this.name+ " is not the dog we discussed ...");

        }
    }

    //convert dog to human years

    public static double humanToDogYears (double years){
        return years * 7;
    }
}
