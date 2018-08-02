package shapes;
//SUBCLASS
public class Rectangle extends Quadrilateral implements Measurable {

    @Override
    public  Double lengthSet(){
        return this.length * this.length;
    };
    @Override
    public Double widthSet(){
        return this.width * this.width;
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

////instances or properties(do not belong to the class because they are not static)
//    protected double length;
//    protected double width;
//
////constructor that accepts 2 numbers for L & W
//    public Rectangle(double length, double width){
//        this.length = length;
//        this.width = width;
//
//    }
//
//    public double getArea(){
//        return length * width;
//    }
//
//    public double getPerimeter(){
//        return (2 * length) + (2* width);
//    }