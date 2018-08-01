package shapes;
//implementor

public class ShapesTest {
    public static void main(String[] args){
        Rectangle rectangle1 = new Rectangle(2,3);//created new rectangle
//testing that new rectangle is getting the constructor
        System.out.println("Rectangle "+ rectangle1.length);
        System.out.println("Rectangle " + rectangle1.width);

        Rectangle rectangle2 = new Square(4);//created new rectangle
//testing that new square is getting the constructor
        System.out.println("Square " +rectangle2.length);
        System.out.println("Square " + rectangle2.getArea());
    }
}
