package shapes;

public class Circle {
//    circumference = 2 x pi x radius
//    area = pi x (radius ^ 2)

    private double radius;
    private double area;
    private double circumference;
    private double diameter;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius () {
        return this.radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        double area = Math.PI * (radius * radius);
        return this.area;
    }
    public void setArea() {
        this.area = area;
    }

    public double getCircumference() {
        double circumference = 2 * Math.PI * radius;
        return this.circumference;
    }
    public void setCircumference() {
        this.circumference = circumference;
    }

}


