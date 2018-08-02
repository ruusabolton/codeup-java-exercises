package shapes;
//implementor

public class ShapesTest {
    public static void main(String[] args){

//        Modify your ShapesTest class, use it to:
//
//        declare a variable of the type Measurable named myShape.
//                display the shape's area and circumference
//        Test your code by creating instances of both Square and Rectangle and assigning them to myShape.


        //REMEMBER - you cannot instanciate an Interface!! create another datatype
Measurable myShape = new Square(10,5) ;

Square square = new Square(5.5, 2.5);
Rectangle rectangle = new Rectangle(6,7);
//square = myShape;//ERROR: incompatible types

//        System.out.println(myShape.getPerimeter(2));//getPerimeter() in Measurable cannot be applied
//        System.out.println(myShape.getArea(3));//getArea() in Measurable cannot be applied
        System.out.println("Area-Rectangle: "+rectangle.getArea());
        System.out.println("Perimeter-Square: "+ square.getPerimeter());
        System.out.println("Area-Square: "+square.getArea());
        System.out.println("Perimeter-Rectangle: "+ rectangle.getPerimeter());
        System.out.println("Perimeter-myShape: "+ myShape.getPerimeter());
        System.out.println("Area-myShape: "+myShape.getArea());


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
