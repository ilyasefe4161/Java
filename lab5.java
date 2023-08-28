public class Main {
    public static void main(String[] args) {
        Person p1=new Person("ilyasefe","sarısüleyman",20,"student");
        Car c1=new Car(p1,"blue","bmw");
        c1.getOwner().showInfo();
        //p1.showInfo();

        Person p2=new Person("ensar","sak",21,"engineer");
        c1.changeOwner(p2);
        c1.getOwner().showInfo();
        c1.showInfo();
    }
}