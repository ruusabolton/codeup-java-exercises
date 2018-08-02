package shapes;
//subclass
public class Square extends Quadrilateral{

//Change your existing Square class to extend Quadrilateral.
//
//Because the length of all sides of a sqare are the same, the methods for setting the length and the width should set both protected properties.


    Square(){
        super();
    }
    @Override
    public  Double lengthSet(){
        return this.length * 2;
    };
    @Override
    public Double widthSet(){
        return this.width * 2;
    };
    @Override
    public  double getPerimeter(){
        return (2 * length) + (2* width);

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

