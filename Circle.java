public  class Circle extends  Shape2D{

    public double propertyForCircle;
    public Circle(double radius){
        super(radius); // using Constructor-2
        //this.radius = radius; // radius propery is coming from Shape2D class
    }


    @Override
    public double getArea() {
        return PI * radius *radius;
    }

    @Override
    public String toString() {
        return "Radius : "+ radius+"Circle Area : "+this.getArea();
    }
}
