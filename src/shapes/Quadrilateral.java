package shapes;

public abstract class Quadrilateral extends Shape implements Measurable{
//protected properties
    protected double length;
    protected double width;
//constructor that accepts 2 numbers for L & W and sets thos pty's
    public void Rectangle(double length, double width){
        this.length = length;
     }
//a constructor that accepts two numbers for the length and width and sets those properties
    public double getLength(){
        return length ;
    }
    public double getWidth(){
        return width;
    }
//methods for getting the length and width
    public abstract Double lengthSet();
    public abstract Double widthSet();

    public double getArea(Double length, Double width){
        return length * width;
    }
    public double getPerimeter(){
        return 2*length + 2*width;
    }

}
