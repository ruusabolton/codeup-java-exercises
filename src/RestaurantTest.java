//create class with main method;
public class RestaurantTest {

    public static void main(String [] args){

        RestaurantDish dish = new RestaurantDish();
//instantiate object with name of dish
        dish.costIncents = 5000;
        dish.wouldRecommend = false;
//        dish.eat("Nond");
        Person.world_population += 1;//adds 1 to hard-coded value of world_population
//        dish.setName = "Jappi";

        dish.setName("Noki");//calling method in RestaurantDish
        System.out.println(dish.getName());//calling method in RestaurantDish
        dish.setName("Jappi");//calling method in RestaurantDish

        System.out.println(dish.getName());//calling method in RestaurantDish
        System.out.println(dish.costIncents);
        System.out.println(dish.wouldRecommend);
        System.out.println(Arithmetic.pi); //calling form a diff class
        System.out.println(Person.world_population); //calling form a diff class



    }
}
