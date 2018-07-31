public class BurgerTester {



        public static void main(String [] args){

            BurgerTools burger = new BurgerTools();

            burger.nameBurger= "Hunger_Buster";
            burger.mostPopularTopping = "9_GrainsCheese";
            burger.averageDaysBeforeExpiration=4;
            burger.orderMinimum = true;
            burger.temperatureWhenCooked = 170;
            burger.order(9);


            System.out.print("Now grilling "+burger.nameBurger);
            System.out.print(" at "+burger.temperatureWhenCooked+ " degrees.");


        }
    }

