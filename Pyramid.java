public class Pyramid extends Shape3D{
    public Pyramid(double depth, double height, double width){
        super(width, height, depth);
    }
    public double getVolume(){
        return getArea()*depth;
    }
    public double getArea(){
        return height*width;
    }
    public String toString() {
        return "Pyramid  Volume : "+getVolume() + " Area : "+getArea();
    }
}
