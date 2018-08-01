package shapes;

import  util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("For your radius, ");
        double userInt = input.getDouble();
        Circle circle = new Circle(userInt);//create new Circle object small c-circle; big c Circle=datatype; must be below call for import

        System.out.println(circle.getRadius());

        System.out.println("\nFor your Circumference: ");
        System.out.println(circle.getCircumference() + input.getDouble());
        System.out.println("\nFor your Area: ");
        System.out.println(circle.getArea() + input.getDouble());
        System.out.println("\nCircumference (2 x pi x radius)=  "+ 2 *  Math.PI *  circle.getRadius()+ ".");
        System.out.println("\nArea (pi x (radius x radius))= "+ Math.PI *   circle.getRadius()*circle.getRadius() + ".");
    }

}
