package shapes;
//subclass
public class Square extends Quadrilateral{

//Change your existing Square class to extend Quadrilateral.
//
//Because the length of all sides of a sqare are the same, the methods for setting the length and the width should set both protected properties.

    public Square(double length, double width){
        super(length, width);//passes one value twice because rectangle method needs 2 values
        }

    @Override
    void lengthSet(double length){
        this.length = length;
    };
    @Override
    void widthSet(double width){
        this.width = width;
    };
    @Override
    public  double getPerimeter(){
        return (4 * length);

    };

    @Override
    public  double getArea(){
        return length * width;

    };
}

//INHERITANCE & POLYMORPHISM EXERCISE

//    public Square(double side){
//        super(side, side);//passes one value twice because rectangle method needs 2 values
//        }
//    @Override
//    public double getArea() {
//        return length * length;//since each side has same value, you can use either L*L or W*W
//        }
//    @Override
//    public double getPerimeter(){
//            return 4 * length;
//        }

