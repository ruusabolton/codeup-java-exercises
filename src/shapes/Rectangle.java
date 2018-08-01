package shapes;
//blueprint
//superclass
public class Rectangle {

//instances or properties(do not belong to the class because they are not static)
    protected double length;
    protected double width;

//constructor that accepts 2 numbers for L & W
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;

    }

    public double getArea(){
        return length * width;
    }

    public double getPerimeter(){
        return (2 * length) + (2* width);
    }
}
