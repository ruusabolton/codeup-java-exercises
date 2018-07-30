//create class with properties as well as a method.
public class RestaurantDish {

//properties
    public Integer costIncents;
    private String nameOfDish = "PizzaGator";
    public boolean wouldRecommend;

//method
//    public void eat(String dish) {
//        System.out.println("Nom nom nom");
//
//    }
    public String getName (){
        return nameOfDish;
    }

    public void setName(String name){
        this.nameOfDish = name;
    }
}