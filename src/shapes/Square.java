package shapes;
//subclass
public class Square extends Rectangle{
    public Square(double side){
        super(side, side);//passes one value twice because rectangle method needs 2 values
        }
    @Override
    public double getArea() {
        return length * length;//since each side has same value, you can use either L*L or W*W
        }
    @Override
    public double getPerimeter(){
            return 4 * length;
        }


}
