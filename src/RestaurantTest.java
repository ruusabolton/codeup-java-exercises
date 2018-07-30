//create class with main method;
public class RestaurantTest {

    public static void main(String [] args){

        RestaurantDish dish = new RestaurantDish();
//instantiate object with name of dish
        dish.nameOfDish = "Pastalione";
        dish.costIncents = 5000;
        dish.wouldRecommend = false;
        dish.eat("Nond");

        System.out.println(dish.nameOfDish);
        System.out.println(dish.costIncents);
        System.out.println(dish.wouldRecommend);


    }
}
