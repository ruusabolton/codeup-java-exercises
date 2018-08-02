package shapes;
//SUBCLASS
public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle (double length, double width){
        super(length, width);
    }
    @Override
    public  double getLength(){
        return this.length * this.length;
    };

    @Override
    public double getWidth(){
        return this.width * this.width;
    };


//IMPLEMENTING ABSTRACT'S METHODS
    @Override
    void lengthSet(double length){
        this.length = length;
    };
    @Override
    void widthSet(double width){
        this.width = width;
    };
//IMPLEMENTING MEASURABLE'S METHODS

    @Override
    public  double getPerimeter(){
        return (2 * this.length) + (2* this.width);

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