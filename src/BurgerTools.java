public class BurgerTools {

    public String nameBurger;
    public Integer averageDaysBeforeExpiration;
    public String mostPopularTopping;
    private String patties = "grilledChicken";
    public Integer temperatureWhenCooked;
    private Integer costIncents = 5000;
    private Integer orderQuantity = 9;
    public boolean orderMinimum;


    public void order(Integer quantityBurger){
        System.out.println("Grilling burger ...");
        System.out.print("You ordered " + orderQuantity +" "+ patties);
        System.out.println(" and your minimum is " + orderMinimum);

    }



}
