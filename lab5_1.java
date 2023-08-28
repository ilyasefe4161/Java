public class Main {
    public static void main(String[] args) {
    Circle circle1 = new Circle();
    Circle circle2 = new Circle();
    Circle circle3 = new Circle();
    circle1.setRadius(5);
    circle2.setRadius(10);
    circle3.setRadius(15);
    System.out.println(circle1.computeArea());
    System.out.println(circle2.computeArea());
    System.out.println(circle3.computeArea());

    Circle[] array = {circle1, circle2, circle3};
    //Circle[] array1 = ;

        for ( Circle i :array) {
            System.out.println(i.computeArea());
        }
    }
}