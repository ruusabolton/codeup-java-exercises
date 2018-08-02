package shapes;
//implementor

public class ShapesTest {
    public static void main(String[] args){

//        Modify your ShapesTest class, use it to:
//
//        declare a variable of the type Measurable named myShape.
//                display the shape's area and circumference
//        Test your code by creating instances of both Square and Rectangle and assigning them to myShape.

Measurable myShape = new Measurable() {
    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }
};

Square square = new Square();
Rectangle rectangle = new Rectangle();
//square = myShape;//ERROR: incompatible types

//        System.out.println(myShape.getPerimeter(2));//getPerimeter() in Measurable cannot be applied
//        System.out.println(myShape.getArea(3));//getArea() in Measurable cannot be applied
        System.out.println(rectangle.getArea(5.5,5.5));
//        System.out.println(rectangle.getPerimeter(3));//ERROR getPerimeter() in Rectangle cannot be applied to (int)

    }
}


//INHERITANCE & POLYMORPHISM EXERCISE

//        Rectangle rectangle1 = new Rectangle();//created new rectangle
////testing that new rectangle is getting the constructor
//        System.out.println("Rectangle "+ rectangle1.length);
//        System.out.println("Rectangle " + rectangle1.width);
//
//        Rectangle rectangle2 = new Square();//created new rectangle
////testing that new square is getting the constructor
//        System.out.println("Square " +rectangle2.length);
//        System.out.println("Square " + rectangle2.getArea());
