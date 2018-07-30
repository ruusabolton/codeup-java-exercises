public class Dog {
    public String name;
    public String breed;
    //creating a static constant; cannot be changed in the app
    public final String animalType = "Canine";
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
}
