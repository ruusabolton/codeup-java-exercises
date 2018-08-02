package shapes;
//BLUEPRINT

public abstract class Quadrilateral extends Shape implements Measurable{
//protected properties
    protected double length;
    protected double width;

//create a constructor that accepts two numbers for the length and width and sets those properties
    public Quadrilateral(double length, double width){
        this.length = length;
        this.width = width;
    }
// create a method to get to the L & W
    public double getLength(){
        return this.length ;
    }
    public double getWidth(){
        return this.width;
    }

//abstract methods for Setting the length and width (in effect forcing subclasses to create indiv implementation
//At this stage we don't know whether length/width will be used by Rectangle or Square (each have diff calc formulas)
    abstract void lengthSet(double length);
    abstract void widthSet(double width);

//INTERFACE Measurable's methods that must be implemented!!

    public double getArea(double length, double width){
        return 0;
    }

    public double getPerimeter(){
        return 0;
    }

}
