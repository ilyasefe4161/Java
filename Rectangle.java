public class Rectangle extends  Shape2D{

    public double propertyForRectangle;
    public Rectangle(double width, double height){
        super(width,height);
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle Width : "+width +" Height : "+height +" Area : "+getArea();
    }
}
